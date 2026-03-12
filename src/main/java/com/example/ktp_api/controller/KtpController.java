package com.example.ktp_api.controller;

import com.example.ktp_api.dto.*;
import com.example.ktp_api.service.KtpService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
@CrossOrigin
public class KtpController {

    private final KtpService service;

    public KtpController(KtpService service){
        this.service = service;
    }

    @PostMapping
    public KtpResponse create(@RequestBody KtpRequest request){
        return service.create(request);
    }

    @GetMapping
    public List<KtpResponse> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public KtpResponse getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public KtpResponse update(@PathVariable Integer id,
                              @RequestBody KtpRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}