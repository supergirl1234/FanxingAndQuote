package com;

/**
 * Author:Fanleilei
 * Created:2019/5/17 0017
 *
 * 泛型的上下限
 */
public class MessageFanxing3 {



    //泛型上限
    public static void print(Connection<? extends Integer>  value){
        System.out.println(value.getValue());


    }
    public static void print1(Callphone<? extends Number>  value){
        System.out.println(value.getValue());


    }

    //泛型下限
    public static void print2(Callphone<? super String>  value){
        System.out.println(value.getValue());


    }


    public static void main(String[] args) {

        Connection<Integer> p1=new Connection<>();
        p1.setValue(12);
        System.out.println(p1.getValue());


        //Connection<String> p2=new Connection<>();//这个就是错误的，因为Connection类的上限是Number类，对象的类型只能设置为Number类及其子类

        Callphone<String>  h=new Callphone<>();
        h.setValue("hehe");
        MessageFanxing3.print2(h);

    }
}

//泛型上限
class Connection<T extends Number>{//表明只能够设置Number或其子类

private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}

class Callphone<E>{
    private E value;

    public void setValue(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }
}



