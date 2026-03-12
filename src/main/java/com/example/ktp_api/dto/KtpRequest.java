package com.example.ktp_api.dto;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

@Data
public class KtpRequest {

    private String nomorKtp;
    private String namaLengkap;
    private String alamat;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tanggalLahir;

    private String jenisKelamin;
}