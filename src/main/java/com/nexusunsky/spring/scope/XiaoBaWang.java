package com.nexusunsky.spring.scope;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.IGamePlayer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
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
