package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    @DisplayName("descript")
    @Test
    void asd() {
        System.out.println("asd");
        AnnotationConfigApplicationContext x = new AnnotationConfigApplicationContext(Config.class, Config2.class);

        final X test = x.getBean("x", X.class);
        test.print();
        System.out.println("asd");
    }
}
