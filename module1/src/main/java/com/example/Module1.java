package com.example;

public class Module1 {

    public void print(){
        System.out.println("i'm module1");
    }

    // class not found exception
    // 왜 런타임 api는 없지? -> 런타임 의존은 사실상 api로 선언할 이유가 없음 컴파일 의존성만 중요
//        new Siso().print("Module1");
}
