package com;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */

//泛型指的就是在类定义的时候并不会设置类中的属性或方法中的参数的具体类型，而是在类使用时再进行定
//注意：泛型只能接受类，所有的基本数据类型必须使用包装类！
public class Point2<T> {

    //x、y数据类型一样
    private T x;
    private T y;

    public Point2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {

        Point2<Integer> p1=new Point2<>(10,12);
        Integer x=p1.getX();
        Integer y=p1.getY();
        System.out.println("x="+x+" y="+y);


        Point2<String> p2=new Point2<>("北纬20度","，东经30度");
        System.out.println(p2.toString());

    }
}
