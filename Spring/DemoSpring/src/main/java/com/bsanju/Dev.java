package com.bsanju;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Dev {

    public Dev()
    {
        System.out.println("Construct Dev");
    }


    public void build()
    {
        System.out.println("Demo Spring Project");
    }
}
