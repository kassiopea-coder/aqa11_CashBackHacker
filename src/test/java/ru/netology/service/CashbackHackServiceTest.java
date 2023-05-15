package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashback = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldAmountEqual1000() {
        int amount = 1000;

        int expected = 0;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldAmountAbove1000() {
        int amount = 1200;

        int expected = 800;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldAmountBelow1000() {
        int amount = 700;

        int expected = 300;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }
}