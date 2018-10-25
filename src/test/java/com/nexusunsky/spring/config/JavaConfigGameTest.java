package com.nexusunsky.spring.config;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.IGamePlayer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfigGameConfig.class)
public class JavaConfigGameTest {
    @Autowired
    private IGameCard gameCard;

    @Autowired
    private IGamePlayer myLove;

    @Test
    public void testCardShouldNotBeNull() {
        assertNotNull(gameCard);
    }

    @Test
    public void testPlay() {
        myLove.play();
    }
}
