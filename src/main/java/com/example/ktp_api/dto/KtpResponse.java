package com.example.ktp_api.dto;

import lombok.Data;
import java.util.Date;

@Data
public class KtpResponse {

    private Integer id;
    private String nomorKtp;
    private String namaLengkap;
    private String alamat;
    private Date tanggalLahir;
    private String jenisKelamin;
}
