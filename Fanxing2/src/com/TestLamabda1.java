package com;


interface  message{

    void print();
}
public class TestLamabda1 {

    public static void main(String[] args) {

        message p=new message() {
            @Override
            public void print() {
                System.out.println("打印");
            }
        };
        p.print();

        System.out.println("++++++++++++++++++++++++++");

        message m=()-> System.out.println("OK");
        m.print();
    }
}
