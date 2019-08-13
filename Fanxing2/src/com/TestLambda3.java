package com;


interface Eat{

    void doThing();
}
public class TestLambda3 {

    public static void main(String[] args) {

        Eat eat=()->{

            System.out.println("喝汤");
            System.out.println("吃菜");
            System.out.println("洗碗");
        };
        eat.doThing();
    }
}
