package com.example.ktp_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ktp_api.entity.KtpEntity;
import java.util.Optional;

public interface KtpRepository extends JpaRepository<KtpEntity, Integer> {
    Optional<KtpEntity> findByNomorKtp(String nomorKtp);

}