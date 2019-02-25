package com;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */
public class Point1 {

    private Object x;
    private Object y;

    public Point1(Object x, Object y) {
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
        return "Point1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        //接收方不知道数据的类型，接收时容易出错，于是在执行时就会出现
        //ClassCastException 。 ClassCastException 指的是两个没有关系的对象进行强转出现的异常
        //例如下面的例子就是错误的，出现了ClassCastException

        /*//设置数据
        Point1 p = new Point1(10.2,"北纬20度") ;

       // 取出数据
        String x = (String) p.getX() ;
        String y = (String) p.getY() ;
        System.out.println("x = " +x+",y = "+y);*/
    }
}
