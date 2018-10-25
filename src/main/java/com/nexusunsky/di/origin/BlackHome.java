package com.nexusunsky.di.origin;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlackHome {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Seller seller = new Seller();
        final int money = buyer.buy();
        final String goods = seller.sell(money);
        log.debug("Buyer paid 10$ Seller for " + goods);
    }
}
