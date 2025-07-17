package org.example;


import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class Config {

    @Bean
    @Qualifier("kk")
    public Set<String> stringSet() {
        return Set.of("asd3", "asd4");
    }

    @Bean
    @Qualifier("hi")
    public String asd1(){
        return "asd1";
    }


//
//    @Bean
//    public String asd2(){
//        return "asd2";
//    }

    @Bean
    public X x(){
        return new X();
    }
}
