package com.example.ktp_api.mapper;

import com.example.ktp_api.dto.*;
import com.example.ktp_api.entity.KtpEntity;

public class KtpMapper {

    public static KtpEntity toEntity(KtpRequest request){

        KtpEntity entity = new KtpEntity();

        entity.setNomorKtp(request.getNomorKtp());
        entity.setNamaLengkap(request.getNamaLengkap());
        entity.setAlamat(request.getAlamat());
        entity.setTanggalLahir(request.getTanggalLahir());
        entity.setJenisKelamin(request.getJenisKelamin());

        return entity;
    }

    public static KtpResponse toResponse(KtpEntity entity){

        KtpResponse response = new KtpResponse();

        response.setId(entity.getId());
        response.setNomorKtp(entity.getNomorKtp());
        response.setNamaLengkap(entity.getNamaLengkap());
        response.setAlamat(entity.getAlamat());
        response.setTanggalLahir(entity.getTanggalLahir());
        response.setJenisKelamin(entity.getJenisKelamin());

        return response;
    }
}