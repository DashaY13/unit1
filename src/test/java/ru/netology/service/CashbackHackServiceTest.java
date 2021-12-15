package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
        System.out.println();
        System.out.println("Nothing needs to be added");
    }
}