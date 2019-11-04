package com.company;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class starttest {



    @Test
    public void getAnagram() {
        start minStart = new start();

        String[] result = new String[0];
//        result = minStart.getAnagram("hej");

        List<String> kalle = minStart.get("hej");

        for (String output : kalle) {
            System.out.println(output);
        }

        System.out.println("antal poster:" + kalle.size());

        assertEquals("adi","adi" );
    }


}