package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @Test
    void shouldReturnMaxRemain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = hackService.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    void shouldReturnMinBoundRemain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = hackService.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    void shouldReturnNewRemain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = hackService.remain(amount);

        assertEquals(actual, expected);
    }
}
