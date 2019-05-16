package com;

import java.lang.reflect.MalformedParameterizedTypeException;

/**
 * Author:Fanleilei
 * Created:2019/5/16 0016
 */
public class MessageFunction<T> {//MessageFunction<T>是泛型类

    private T message;

    public MessageFunction(T message) {
        this.message = message;
    }

    //泛型方法
    //泛型方法与泛型类稍有不同的地方是，类型参数也就是尖括号那一部分是写在返回值前面的。
    // <T> 中的 T 被称为类型参数，而方法中的 T 被称为参数化类型，它不是运行时真正的参数。

    //泛型方法的写法如下：

    public  <T> void print1(T date){
        System.out.println(date);

    }
    public  <T> T print2(T date){
        return date;

    }

    //这是泛型类中的普通方法
    //泛型类中的普通方法是和反省类联系的
    public void print3(T date){
        System.out.println(date);

    }
     //如果在一个泛型类中存在泛型方法，那么两者的类型参数最好不要同名

    //泛型方法与泛型类可以共存，但他们是相互独立的，互不影响

    public  <E> E print4(E data){
        return data;

    }

    //泛型类中的类型参数与泛型方法中的类型参数是没有相应的联系的

    public static void main(String[] args) {


        MessageFunction<String> p=new MessageFunction<>("hello");

        p.print1(12);
       // p.print3(13);//这个就是错的，因为print3不是泛型方法，是泛型类下的一个普通方法，它的参数类型必须与泛型类的对象的类型相同。
        p.print3("world");
        p.print4(18);
    }
}
