package com.example.ktp_api.service;

import com.example.ktp_api.dto.KtpRequest;
import com.example.ktp_api.dto.KtpResponse;
import java.util.List;

public interface KtpService {

    KtpResponse create(KtpRequest request);

    List<KtpResponse> getAll();

    KtpResponse getById(Integer id);

    KtpResponse update(Integer id, KtpRequest request);

    void delete(Integer id);
}