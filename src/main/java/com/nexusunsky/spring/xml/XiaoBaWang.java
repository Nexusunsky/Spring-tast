package com.nexusunsky.spring.xml;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.IGamePlayer;

public class XiaoBaWang implements IGamePlayer {
    private IGameCard gameCard;

    public XiaoBaWang(final IGameCard myLove) {
        this.gameCard = myLove;
    }

    @Override
    public void play() {
        gameCard.bePlayed();
    }
}
