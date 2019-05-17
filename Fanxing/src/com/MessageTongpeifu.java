package com;

/**
 * Author:Fanleilei
 * Created:2019/5/16 0016
 *
 * 通配符
 */
public class MessageTongpeifu {


    //泛型参数 ？ 通配符解决参数统一的问题


    //还通配符的方法
    public static  void fun1(Message<?> date){

        ///date.setValue(111);//在这个地方，不能这样用
        //说明了在通配符中，可以接收所有的泛型类型，但是又不能够让用户随意修改
        System.out.println(date.getValue());


    }

    //不含通配符的方法
    public static  void fun2(Message<String> date){

        date.setValue("hello");//在普通方法中就可以用set方法修改参数的值

        System.out.println(date.getValue());


    }
    public static void main(String[] args) {

        Message<Integer> p1=new Message<>();
        Message<String> p2=new Message<>();
        p1.setValue(12);
        p2.setValue("world");
        fun1(p1);
        fun1(p2);

        fun2(p2);

    }
}



class Message<T>{
    private  T value;


    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}