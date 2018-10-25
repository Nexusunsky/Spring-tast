package com.nexusunsky.di.newstyle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ZFB {
    private com.nexusunsky.di.newstyle.Buyer buyer;
    private com.nexusunsky.di.newstyle.Seller seller;

    public ZFB() {
        buyer = new com.nexusunsky.di.newstyle.Buyer();
        seller = new com.nexusunsky.di.newstyle.Seller();
    }

    public void deal() {
        int money = buyer.buy();
        String goods = seller.sell(money);
        log.debug("Buyer paid 10$ Seller for " + goods);
    }

    public static void main(String[] args) {
        ZFB zfb = new ZFB();
        zfb.deal();
    }
}
