package com.devsuperior.dsvendas.controller.response;

import com.devsuperior.dsvendas.entity.SellerEntity;

import java.io.Serializable;

public class SaleSumResponse implements Serializable {

    private String sellerName;
    private Double sum;

    public SaleSumResponse(){

    }

    public SaleSumResponse(SellerEntity sellerEntity, Double sum) {
        this.sellerName = sellerEntity.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
