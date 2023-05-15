package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashback = new CashbackHackService();

    @org.junit.Test

    public void shouldAmountEqual1000() {
        int amount = 1000;

        int expected = 0;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void shouldAmountAbove1000() {
        int amount = 1200;

        int expected = 800;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void shouldAmountBelow1000() {
        int amount = 700;

        int expected = 300;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }
}