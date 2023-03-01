package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void remainTestAverageAmount(){

        int expected = 500;
        int actual = service.remain(500);

        assertEquals(expected, actual);
    }

    @Test
    public void remainTestAmountIsZero(){

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }

    @Test
    public void remainTestAmountIsMin(){

        int expected = 999;
        int actual = service.remain(1);

        assertEquals(expected, actual);
    }

    @Test
    public void remainTestAmountIsMax(){

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }

    @Test
    public void remainTestAmountIsMultipleOfThousand(){

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }


  
}