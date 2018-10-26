package com.nexusunsky.ioc.springstyle;

import com.nexusunsky.ioc.springstyle.role.SellerRole;

import org.springframework.stereotype.Component;

@Component
public class Yeye extends SellerRole {
    @Override
    public String sell(int money) {
        if (money == 10) {
            return "赵云的皮肤";
        }
        return null;
    }
}
