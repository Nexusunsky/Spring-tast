package com.nexusunsky.ioc.newstyle;

import com.nexusunsky.ioc.newstyle.role.BuyerRole;
import com.nexusunsky.ioc.newstyle.role.SellerRole;

public class Huluwa extends BuyerRole {
    @Override
    public String buy(final SellerRole seller) {
        return seller.sell(10);
    }
}
