package com.nexusunsky.ioc.springstyle;

import com.nexusunsky.ioc.springstyle.role.BuyerRole;
import com.nexusunsky.ioc.springstyle.role.SellerRole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Huluwa extends BuyerRole {
    private SellerRole yeye;

    @Autowired
    public Huluwa(SellerRole yeye) {
        this.yeye = yeye;
    }

    @Override
    public String buy() {
        return yeye.sell(10);
    }
}
