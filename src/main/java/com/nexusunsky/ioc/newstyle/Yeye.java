package com.nexusunsky.ioc.newstyle;

import com.nexusunsky.ioc.newstyle.role.SellerRole;

public class Yeye extends SellerRole {
    @Override
    public String sell(int money) {
        if (money == 10) {
            return "赵云的皮肤";
        }
        return null;
    }
}
