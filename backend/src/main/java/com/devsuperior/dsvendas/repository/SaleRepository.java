package com.devsuperior.dsvendas.repository;

import com.devsuperior.dsvendas.controller.response.SaleSuccessResponse;
import com.devsuperior.dsvendas.controller.response.SaleSumResponse;
import com.devsuperior.dsvendas.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<SaleEntity, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.controller.response.SaleSumResponse(obj.seller, SUM(obj.amount))" +
            "FROM SaleEntity AS obj GROUP BY obj.seller")
    List<SaleSumResponse> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.controller.response.SaleSuccessResponse(obj.seller, SUM(obj.visited), SUM(obj.deals))" +
            "FROM SaleEntity AS obj GROUP BY obj.seller")
    List<SaleSuccessResponse> successGroupedBySeller();
}
