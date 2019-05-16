package com;

import sun.plugin2.message.Message;

/**
 * Author:Fanleilei
 * Created:2019/5/16 0016
 */
public interface MessageInterface<T> {

    void print(T t);


}


//子类继承时保留泛型参数
class Message1<T> implements MessageInterface<T>{


    @Override
    public void print(T t) {
        System.out.println(t);

    }

    public static void main(String[] args) {
        MessageInterface<String> p=new MessageInterface<String>() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };

        MessageInterface<String> p2=new Message1<>();
        p2.print("12");

        MessageInterface<Integer> p3=new Message1<>();
        p3.print(10);

    }
}
//子类继承时指定泛型参数
class Message2 implements MessageInterface<Integer>{

    @Override
    public void print(Integer integer) {
        System.out.println(integer);
    }

    public static void main(String[] args) {
        //MessageInterface<String> p1=new Message2();//这个是错误的,因为Message2已经确定是Integer类型的1了
        MessageInterface<Integer> p2=new Message2();
        Message2 p3=new Message2();
        p2.print(11);
        p3.print(12);
    }
}
