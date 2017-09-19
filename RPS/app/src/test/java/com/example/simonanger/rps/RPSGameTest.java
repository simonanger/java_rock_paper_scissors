package com.example.simonanger.rps;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by simonanger on 19/09/2017.
 */
public class RPSGameTest {
    RPSGame game;
    RPSGame spyGame;

    @Before
    public void before() {
        game = new RPSGame();
        spyGame = Mockito.spy(game);
    }

    @Test
    public void testPlayerHandNull() {
        assertEquals(-1, spyGame.playHand(null));
    }

    @Test
    public void testPlayerHandRock() {
        Mockito.when(spyGame.generateComputerHand()).thenReturn(HandType.SCISSORS);

        assertEquals(1, spyGame.playHand(HandType.ROCK));
    }

    @Test
    public void testPlayerLossCallsScissors() {
        Mockito.when(spyGame.generateComputerHand()).thenReturn(HandType.ROCK);

        assertEquals(2, spyGame.playHand(HandType.SCISSORS));
    }

    @Test
    public void testDraw() {
        Mockito.when(spyGame.generateComputerHand()).thenReturn(HandType.PAPER);

        assertEquals(0, spyGame.playHand(HandType.PAPER));
    }
}