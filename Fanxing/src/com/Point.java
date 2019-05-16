package com;

/**
 * Author:Fanleilei
 * Created:2019/5/16 0016
 */
public class Point {

    //在java中只有一种类型可以保存所有类型：Object型
    //如果将x、y的类型换成int或double或String类型，，则x、y就只能代表一种类型，如果想存储其他类型的坐标就没办法存储了
    private Object x;
    private  Object y;

    public Point(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    public Object getX() {
        return x;
    }

    public Object getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {

        Point p=new Point(16,13);
        //如果x、y的类型是Object，那么接收数据的时候，就不知道数据到底是什么类型的了，在转型的时候，有可能设置错误类型。
        System.out.println(p.getX());
        System.out.println(p.getY());


        Point p2=new Point(16,"北纬30度");
        System.out.println( p2.getX());
        System.out.println(p2.getY());
    }
}
