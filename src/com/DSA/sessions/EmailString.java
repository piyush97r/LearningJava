package com.DSA.sessions;

import java.util.*;

class EmailString {
    public static void main(String[] args)
    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};
        String NewEmail="monica.geller@xyz.com";

        int i=0;

        for (String s: emails)
        {
            if(NewEmail == s)
                break;
                i++;
        }
        if(i==emails.length) System.out.println("-1");
        else {System.out.println(i);
    }
}
