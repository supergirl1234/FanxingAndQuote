package commm;

import java.util.ArrayList;

public class TestFanxingFunction {

   /* <T> 中的 T 被称为类型参数，而方法中的 T 被称为参数化类型，它不是运行时真正的参数*/
    /*类型参数和参数化类型必须一样*/
    public <T> void print1(T t){
        System.out.println(t);

    }
    public <E> void print2(E e){
        System.out.println(e);

    }
    public <T> T print3(T t){
        System.out.println(t);
        return t;

    }



    public static void main(String[] args) {

        TestFanxingFunction p=new TestFanxingFunction();
        p.print1(12);
        p.print1("campus");
        p.print2("campus");
        System.out.println(p.print3(new char[]{'a','b','c','d'}));
    }
}
