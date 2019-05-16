package com;

/**
 * Author:Fanleilei
 * Created:2019/5/16 0016
 */
public class PointFanxing<T> {
    //尖括号 <> 中的 T 被称作是类型参数，用于指代任何类型
    //如果一个类被 <T> 的形式定义，那么它就被称为是泛型类
    //注意：泛型只能接受类，所有的基本数据类型必须使用包装类

    //x、y的类型相同
    private T x;
    private T y;

    public PointFanxing(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public static void main(String[] args) {
        //有一个缺点，就是x、y的类型必须相同
        PointFanxing<Integer>  point=new PointFanxing<>(12,13);
        Integer x=point.getX();
        Integer y=point.getY();
        System.out.println("x="+x+","+"y="+y);


        PointFanxing<String>  point2=new PointFanxing<>("北纬30度","东经12度");
        String x1=point2.getX();
        String y1=point2.getY();
        System.out.println("x1="+x1+","+"y1="+y1);

    }
}
