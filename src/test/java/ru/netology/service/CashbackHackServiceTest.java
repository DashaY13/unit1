package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void shouldMustAdd0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 50;

        int actual = service.remain(amount);
        int expected = 950;

        assertEquals(actual, expected);
        System.out.println();
        System.out.println("Nothing needs to be added");
    }

    @Test
    public void shouldMustAdd1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
        System.out.println();
        System.out.println("Nothing needs to be added");
    }

    @Test
    public void shouldMustAdd2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
        System.out.println();
        System.out.println("Nothing needs to be added");
    }

    @Test
    public void shouldMustAdd3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
        System.out.println();
        System.out.println("Nothing needs to be added");
    }
}