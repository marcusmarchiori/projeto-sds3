package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.controller.response.SellerResponse;
import com.devsuperior.dsvendas.entity.SellerEntity;
import com.devsuperior.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerResponse> findAll(){
        List<SellerEntity> result = sellerRepository.findAll();
        return result.stream().map(x -> new SellerResponse(x)).collect(Collectors.toList());
        // map vai converter a coleção original para SellerResponse,
        // para cada x da lista original cria-se um novo objeto SellerResponse
        // collect converte stream pra lista novamente
    }

}
