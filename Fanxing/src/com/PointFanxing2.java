package com;

/**
 * Author:Fanleilei
 * Created:2019/5/16 0016
 */

//为了让坐标x、y的类型不一样，可以用下面的方法
public class PointFanxing2<T,E> {


    //x、y的类型可以不一样
    private T x;
    private E y;

    public PointFanxing2(T x, E y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public E getY() {
        return y;
    }

    public static void main(String[] args) {
        PointFanxing2<Integer, String> point2 = new PointFanxing2<>(20, "北纬30度");
        Integer x = point2.getX();
        String y = point2.getY();
        System.out.println("(" + x + ", " + y + ")");
    }


}
