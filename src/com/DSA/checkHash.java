package com.DSA;

import java.util.Hashtable;


class checkHash {
    public static void main(String[] args)
    {
        Hashtable<String,Integer> emails= new Hashtable<String,Integer>();
        emails.put("chandler.bing@xyz.com",1);
        emails.put("ross.geller@xyz.com",2);
        emails.put("rachel.greene@xyz.com",3);
        emails.put("joey.tribbiani@xyz.com",4);
        emails.put("monica.geller@xyz.com",5);
        emails.put("phoebe.buffay@xyz.com",6);
        emails.put("sheldon.copper@xyz.com",7);
        emails.put("marie.george@xyz.com",8);

        String NewEmail = "monica.geller@xyz.com";

        if(emails.containsKey(NewEmail))
        {
            System.out.println(emails.get("monica.geller@xyz.com"));
        }
        else System.out.println("False");
    }
}
