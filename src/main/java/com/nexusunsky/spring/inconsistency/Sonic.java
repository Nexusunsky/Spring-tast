package com.nexusunsky.spring.inconsistency;

import com.nexusunsky.spring.IGameCard;

public class Sonic implements IGameCard {
    private String name;
    private String content;

    public Sonic() {
        name = "Sonic";
        content = " A Blue Rabbit Running ";
    }

    @Override
    public void bePlayed() {
        System.out.println(name + " is Playing " + content);
    }
}
