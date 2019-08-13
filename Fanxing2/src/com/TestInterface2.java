package com;


interface  IMessage2{

    //还可以将子类中的相同实现方法在接口中定义为静态方法，通过类直接调用该方法
    public static void print(){
        System.out.println("我是接口中的静态方法");

    }
    public void say();
}

class  Online implements IMessage2{


    @Override
    public void say() {
        System.out.println("我是Internet网");
    }
}
public class TestInterface2 {

    public static void main(String[] args) {
        IMessage2 p=new Online();
        IMessage2.print();/*类调用接口中的静态方法*/
        p.say();
    }
}
