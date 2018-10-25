package com.nexusunsky.spring.auto;

import com.nexusunsky.spring.IGameCard;

import org.springframework.stereotype.Component;

@Component
public class Hundouluo implements IGameCard {
    private String name;
    private String content;

    public Hundouluo() {
        name = "Hundouluo";
        content = "Two brothers hit flights";
    }

    @Override
    public void bePlayed() {
        System.out.println(name + " is Playing " + content);
    }
}
