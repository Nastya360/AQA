package ru.netology.service;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainWhenAmount200() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        assertEquals(800, service.remain(amount));
    }

    @org.junit.Test
    public void remainWhenAmount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        assertEquals(999, service.remain(amount));
    }

    @org.junit.Test
    public void remainWhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        assertEquals(0, service.remain(amount));
    }

    @org.junit.Test
    public void remainWhenAmount5600() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5600;
        assertEquals(400, service.remain(amount));
    }

    @org.junit.Test
    public void remainWhenAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        assertEquals(1000, service.remain(amount));
    }

    @org.junit.Test
    public void remainWhenAmount1_000_500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000_500;
        assertEquals(500, service.remain(amount));
    }


}