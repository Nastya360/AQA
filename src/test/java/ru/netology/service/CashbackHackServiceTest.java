package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainWhenAmount200() {
        CashbackHackService service= new CashbackHackService();
        int amount=200;
        assertEquals(service.remain(amount),800);
    }
    @org.testng.annotations.Test
    public void testRemainWhenAmount1() {
        CashbackHackService service= new CashbackHackService();
        int amount=1;
        assertEquals(service.remain(amount),999);
    }
    @org.testng.annotations.Test
    public void testRemainWhenAmount1000() {
        CashbackHackService service= new CashbackHackService();
        int amount=1000;
        assertEquals(service.remain(amount),0);
    }
    @org.testng.annotations.Test
    public void testRemainWhenAmount999() {
        CashbackHackService service= new CashbackHackService();
        int amount=999;
        assertEquals(service.remain(amount),1);
    }
    @org.testng.annotations.Test
    public void testRemainWhenAmount5600() {
        CashbackHackService service= new CashbackHackService();
        int amount=5600;
        assertEquals(service.remain(amount),400);
    }
    @org.testng.annotations.Test
    public void testRemainWhenAmount0() {
        CashbackHackService service= new CashbackHackService();
        int amount=0;
        assertEquals(service.remain(amount),1000);
    }
    @org.testng.annotations.Test
    public void testRemainWhenAmount1_000_500() {
        CashbackHackService service= new CashbackHackService();
        int amount=1_000_500;
        assertEquals(service.remain(amount),500);
    }
}