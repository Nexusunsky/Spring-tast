package com.nexusunsky.ioc.newstyle;

import com.nexusunsky.ioc.newstyle.role.BuyerRole;
import com.nexusunsky.ioc.newstyle.role.SellerRole;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MouBao {
    private Class<? extends BuyerRole> buyerClz;
    private Class<? extends SellerRole> sellerClz;

    public MouBao(final Class<? extends BuyerRole> buyer, final Class<? extends SellerRole> seller) {
        this.buyerClz = buyer;
        this.sellerClz = seller;
    }

    public void deal() throws IllegalAccessException, InstantiationException {
        BuyerRole buyer = buyerClz.newInstance();
        SellerRole seller = sellerClz.newInstance();
        String goods = buyer.buy(seller);
        log.debug(buyer.getClass().getCanonicalName() + " paid 10 for " + goods);
    }
}
