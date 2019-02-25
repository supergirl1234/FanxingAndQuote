package com;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */
public class Point3<T,S> {

    private T x;
    private S y;

    public Point3(T x, S y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public S getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point3{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {

        Point3<Integer,String> p1=new Point3<>(12,"北纬20度");
        Integer x=p1.getX();
        String y=p1.getY();
        System.out.println("x="+x+" y="+y);

        Point3<Integer,Integer> p2=new Point3<>(13,24);
        System.out.println(p2.toString());



    }
}
