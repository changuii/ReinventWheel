package org.example;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class X {

    @Autowired
    @Qualifier("hi")
    String result;

    public void print(){
        System.out.println(result);
    }
}
