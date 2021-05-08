package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.controller.response.SaleResponse;
import com.devsuperior.dsvendas.controller.response.SaleSuccessResponse;
import com.devsuperior.dsvendas.controller.response.SaleSumResponse;
import com.devsuperior.dsvendas.entity.SaleEntity;
import com.devsuperior.dsvendas.repository.SaleRepository;
import com.devsuperior.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true) // Garantir que toda operação com o banco seja garantida
                                    // readOnly mostra que é só uma leitura no banco
    public Page<SaleResponse> findAll(Pageable pageable){
        sellerRepository.findAll(); // Armazena todos os vendedores em cache para não ter que buscar um por um no banco
        Page<SaleEntity> result = saleRepository.findAll(pageable);
        return result.map(x -> new SaleResponse(x));
        // para cada x da lista original cria-se um novo objeto SaleResponse
    }

    @Transactional(readOnly = true)
    public List<SaleSumResponse> amountGroupedBySeller(){
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessResponse> successGroupedBySeller(){
        return saleRepository.successGroupedBySeller();
    }

}
