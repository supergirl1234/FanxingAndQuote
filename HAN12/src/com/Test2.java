package com;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */

@FunctionalInterface
interface IUtil1{

    //()->String
    String convert();
}
public class Test2 {

    public static void main(String[] args) {
        IUtil1 iUtil= (  )->{
            return  "hello";

        };
        System.out.println(iUtil.convert());


        //String->大写
        System.out.println("hello".toUpperCase());
        //对象方法引用
        IUtil1 iUtil1="hello"::toUpperCase;
        System.out.println(iUtil1.convert());

        String str="java";
        IUtil1 iUtil2=str::toUpperCase;
        System.out.println(iUtil2.convert());

        print("friend"::toUpperCase);
        print("Hello"::toLowerCase);

        print(new Person("张三",12)::getPersonInfo);



    }

    public  static void print(IUtil1 iUtil1){
        System.out.println(iUtil1.convert());

    }
}


class Person{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getPersonInfo() {
        return "姓名：" + this.name + "年龄：" + this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
