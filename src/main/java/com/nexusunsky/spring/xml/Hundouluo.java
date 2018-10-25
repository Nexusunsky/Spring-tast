package com.nexusunsky.spring.xml;

import com.nexusunsky.spring.IGameCard;

public class Hundouluo implements IGameCard {
    private String name;
    private String content;

    public Hundouluo(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Hundouluo() {
        name = "Hundouluo";
        content = "Two brothers hit flights";
    }

    @Override
    public void bePlayed() {
        System.out.println(name + " is Playing " + content);
    }
}
