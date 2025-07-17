package org.example;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class Main {
    public static void main(String[] args) {
        System.out.println(X.class.getProtectionDomain().getCodeSource().getLocation());
        AnnotationConfigApplicationContext x = new AnnotationConfigApplicationContext(Config.class, Config2.class);

        final X test = x.getBean("x", X.class);
        test.print();
    }

}
