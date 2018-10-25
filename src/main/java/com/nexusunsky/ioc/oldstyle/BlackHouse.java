package com.nexusunsky.ioc.oldstyle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlackHouse {
    public static void main(String[] args) {
        final Huluwa buyer = new Huluwa();
        String goods = buyer.buy();
        log.debug("Huluwa get a " + goods);
    }
}
