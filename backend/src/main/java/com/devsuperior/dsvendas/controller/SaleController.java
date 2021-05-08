package com.devsuperior.dsvendas.controller;

import com.devsuperior.dsvendas.controller.response.SaleResponse;
import com.devsuperior.dsvendas.controller.response.SellerResponse;
import com.devsuperior.dsvendas.service.SaleService;
import com.devsuperior.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleResponse>> findAll(Pageable pageable){
        Page<SaleResponse> list = service.findAll(pageable);
        return ResponseEntity.ok(list); // ok indica a resposta 200 e retorna list no corpo da resposta
    }

}
