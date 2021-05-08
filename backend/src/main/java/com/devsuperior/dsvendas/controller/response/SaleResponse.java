package com.devsuperior.dsvendas.controller.response;

import com.devsuperior.dsvendas.entity.SaleEntity;

import java.time.LocalDate;

public class SaleResponse {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerResponse sellerResponse;

    public SaleResponse(){

    }

    public SaleResponse(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerResponse sellerResponse) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.sellerResponse = sellerResponse;
    }

    public SaleResponse(SaleEntity saleEntity) {
        id = saleEntity.getId();
        visited = saleEntity.getVisited();
        deals = saleEntity.getVisited();
        amount = saleEntity.getAmount();
        date = saleEntity.getDate();
        sellerResponse = new SellerResponse(saleEntity.getSeller());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SellerResponse getSellerResponse() {
        return sellerResponse;
    }

    public void setSellerResponse(SellerResponse sellerResponse) {
        this.sellerResponse = sellerResponse;
    }
}
