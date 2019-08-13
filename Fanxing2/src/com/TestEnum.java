package com;

public enum TestEnum {

    FIRST("张三",12,"陕西"),
    TWO("李四",13,"河南");/*这几个实例之间用，隔开，最后才用；结束*/

    private String name;
    private int age;
    private String address;

    /*枚举类的构造方法是private的*/
    private TestEnum(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
