package com;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */
@FunctionalInterface
interface IUtil{

    //Integer->String
    String convert(Integer value);

}
public class Test1 {

    public static void main(String[] args) {

        IUtil iUtil=(value) -> {

            return String.valueOf(value);
        };

        System.out.println(iUtil.convert(10));

        //静态方法引用
        IUtil iUtil1=String::valueOf;
        System.out.println(iUtil.convert(12));
    }
}
