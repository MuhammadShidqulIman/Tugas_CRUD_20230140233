package com.example.ktp_api.service.impl;

import com.example.ktp_api.dto.*;
import com.example.ktp_api.entity.KtpEntity;
import com.example.ktp_api.mapper.KtpMapper;
import com.example.ktp_api.repository.KtpRepository;
import com.example.ktp_api.service.KtpService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KtpServiceImpl implements KtpService {

    private final KtpRepository repository;

    public KtpServiceImpl(KtpRepository repository){
        this.repository = repository;
    }

    @Override
    public KtpResponse create(KtpRequest request){

        if(repository.findByNomorKtp(request.getNomorKtp()).isPresent()){
            throw new RuntimeException("Nomor KTP sudah ada");
        }

        KtpEntity entity = KtpMapper.toEntity(request);

        repository.save(entity);

        return KtpMapper.toResponse(entity);
    }

    @Override
    public List<KtpResponse> getAll(){

        return repository.findAll()
                .stream()
                .map(KtpMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public KtpResponse getById(Integer id){

        KtpEntity entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));

        return KtpMapper.toResponse(entity);
    }

    @Override
    public KtpResponse update(Integer id, KtpRequest request){

        KtpEntity entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));

        entity.setNomorKtp(request.getNomorKtp());
        entity.setNamaLengkap(request.getNamaLengkap());
        entity.setAlamat(request.getAlamat());
        entity.setTanggalLahir(request.getTanggalLahir());
        entity.setJenisKelamin(request.getJenisKelamin());

        repository.save(entity);

        return KtpMapper.toResponse(entity);
    }

    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
}