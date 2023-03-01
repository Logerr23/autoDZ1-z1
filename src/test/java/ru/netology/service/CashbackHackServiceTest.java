package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainTestAverageAmount(){

        int expected = 500;
        int actual = service.remain(500);

        assertEquals(actual, expected);
    }

    @Test
    public void remainTestAmountIsZero(){

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void remainTestAmountIsMin(){

        int expected = 999;
        int actual = service.remain(1);

        assertEquals(actual, expected);
    }

    @Test
    public void remainTestAmountIsMax(){

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void remainTestAmountIsMultipleOfThousand(){

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }





}