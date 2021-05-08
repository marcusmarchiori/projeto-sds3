package com.devsuperior.dsvendas.controller.response;

import com.devsuperior.dsvendas.entity.SellerEntity;

import java.io.Serializable;

public class SaleSuccessResponse implements Serializable {

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessResponse(){

    }

    public SaleSuccessResponse(SellerEntity sellerEntity, Long visited, Long deals) {
        sellerName = sellerEntity.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
