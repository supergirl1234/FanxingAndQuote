package com;


interface  IMessage {

    public default void print(){//将子类中的相同实现方法在接口中定义为普通方法，这样就不用每一个子类继承接口时都在覆写一次了；通过对象调用该方法
        System.out.println("我是接口中的普通方法");
    }
    public void say();
}

class Message implements  IMessage {

    /*子类只会覆写抽象方法*/
    @Override
    public void say() {
        System.out.println("hello，I am fine");
    }
}

class  Mail implements  IMessage{

    @Override
    public void say() {
        System.out.println("No,I am sorry");
    }
}
public class TestInterfae {

    public static void main(String[] args) {

        IMessage message=new Message();
        message.print();
        message.say();
        System.out.println("++++++++++++++++++++");
        IMessage mail=new Mail();
        mail.print();
        mail.say();
    }
}
