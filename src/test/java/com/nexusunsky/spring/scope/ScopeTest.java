package com.nexusunsky.spring.scope;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.IGamePlayer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScopeConfig.class)
public class ScopeTest {
    @Autowired
    private IGameCard gameCard1;

    @Autowired
    private IGameCard gameCard2;

    @Autowired
    private IGamePlayer player1;

    @Autowired
    private IGamePlayer player2;

    @Test
    public void testCardShouldNotBeNull() {
        assertNotNull(gameCard1);
        assertNotNull(gameCard2);
        assertNotNull(player1);
        assertNotNull(player2);
        assertNotEquals(gameCard1, gameCard2);
        assertEquals(player1, player2);
    }

    @Test
    public void testPlay() {
        player1.play();
        player2.play();
    }
}