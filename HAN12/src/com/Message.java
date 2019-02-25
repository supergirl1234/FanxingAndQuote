package com;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */

//泛型方法与泛型类稍有不同的地方是，类型参数也就是尖括号那一部分是写在返回值前面的。

    //而泛型类中的类型参数与泛型方法中的类型参数是没有相应的联系的，泛型方法始终以自己定义的类型参数为准
public class Message<T> {

    private  T message;

    public Message(T message) {
        this.message = message;
    }

    //泛型方法 与 泛型类 是相互独立的

    //<T> 中的 T 被称为
    //类型参数，而方法中的 T 被称为参数化类型，它不是运行时真正的参数。
    public static  <T> void  print(T data){

        System.out.println(data);
    }
    public  static <T,S> void print(T data,S value){
        System.out.println(data+" "+value);
    }

    public  static <T> T convert(T data){

        return data;
    }

    public T getMessage() {
        return message;
    }

    public <E> void messagePrint(E value){
        System.out.println(value);

    }

    public static void main(String[] args) {


        print("data");
        print(12);
        print(new Point2<>("北纬20度",13));


        Message<String> message=new Message<>("我是一个大学生");
        System.out.println(message.getMessage());

        message.messagePrint(12);

    }
}
