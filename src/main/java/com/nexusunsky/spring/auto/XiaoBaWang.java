package com.nexusunsky.spring.auto;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.IGamePlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XiaoBaWang implements IGamePlayer {
    private IGameCard gameCard;

    @Autowired
    public XiaoBaWang(final IGameCard hundouluo) {
        this.gameCard = hundouluo;
    }

    @Override
    public void play() {
        gameCard.bePlayed();
    }
}
