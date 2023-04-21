package ru.netology.service;

<<<<<<< HEAD
import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainWhenAmount200() {
        CashbackHackService service= new CashbackHackService();
        int amount=200;
        assertEquals(800,service.remain(amount));
    }
    @org.junit.Test
    public void remainWhenAmount1() {
        CashbackHackService service= new CashbackHackService();
        int amount=1;
        assertEquals(999,service.remain(amount));
    }
    @org.junit.Test
    public void remainWhenAmount1000() {
        CashbackHackService service= new CashbackHackService();
        int amount=1000;
        assertEquals(0,service.remain(amount));
    }
    @org.junit.Test
    public void remainWhenAmount5600() {
        CashbackHackService service= new CashbackHackService();
        int amount=5600;
        assertEquals(400,service.remain(amount));
    }
    @org.junit.Test
    public void remainWhenAmount0() {
        CashbackHackService service= new CashbackHackService();
        int amount=0;
        assertEquals(1000,service.remain(amount));
    }
    @org.junit.Test
    public void remainWhenAmount1_000_500() {
        CashbackHackService service= new CashbackHackService();
        int amount=1_000_500;
        assertEquals(500,service.remain(amount));
    }



=======
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
>>>>>>> e55df9c782a50f81a6325460902580ab961b2590
}