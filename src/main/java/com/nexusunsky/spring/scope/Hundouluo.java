package com.nexusunsky.spring.scope;

import com.nexusunsky.spring.IGameCard;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
