package com.nexusunsky.ioc.newstyle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlackHoues {
    public static void main(String[] args) {
        try {
            Class huluwa = Huluwa.class;
            Class yeye = Yeye.class;
            MouBao mb = new MouBao(huluwa, yeye);
            mb.deal();
        } catch (IllegalAccessException | InstantiationException e) {
            log.error("Deal is failed.");
        }
    }
}
