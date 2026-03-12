package com.example.ktp_api.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name="ktp")
public class KtpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nomorKtp", unique = true)
    private String nomorKtp;

    @Column(name = "namaLengkap")
    private String namaLengkap;

    @Column(name = "alamat")
    private String alamat;

    @Temporal(TemporalType.DATE)
    @Column(name = "tanggalLahir")
    private Date tanggalLahir;

    @Column(name = "jenisKelamin")
    private String jenisKelamin;
}