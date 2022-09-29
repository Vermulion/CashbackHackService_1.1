package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnMaxRemain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = hackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinBoundRemain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = hackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNewRemain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = hackService.remain(amount);

        assertEquals(expected, actual);
    }
}