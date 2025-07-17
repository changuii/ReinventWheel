package org.example.my;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class test {

    interface Bird{
        void eat();
    }
    class Pigon implements Bird{

        public void some(){
            System.out.println("x");
        }

        @Override
        public void eat() {

        }
    }

    class Penguin implements Bird{

        @Override
        public void eat() {

        }
    }

    @DisplayName("test")
    @Test
    void test1() {
        final Pigon pigon = new Pigon();
        final Penguin penguin = new Penguin();

        something(penguin);
    }

    public void something(final Bird bird){
        bird.eat();
    }

}
