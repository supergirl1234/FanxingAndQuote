package com;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */
public class TestCanshu {


    public static int add(int[] data){
        if(data==null){
            return  0;

        }
        int sum=0;
        for(int i=0;i<data.length;i++){

            sum+=data[i];

        }
        return sum;

    }

    //可变参数
    public static  int add2(int ...data){//本身还是一个数组//随意传递的内容，随意个数
        if(data==null){
            return  0;

        }
        int sum=0;
        for(int i=0;i<data.length;i++){

            sum+=data[i];

        }
        return sum;
    }

    //如果要传递多类参数，可变参数一定放在最后，并且只能设置一个可变参数

    public static void print(int data,String ...message){

        String str="";
        for(int i=0;i<message.length;i++){
            str+=message[i];

        }
        str+=data;
        System.out.println(str);

    }
    public static void main(String[] args) {

        System.out.println(add(new int[]{}));
        System.out.println(add(new int[]{1,2,3}));
        System.out.println(add(null));


        System.out.println("----------------------");

        System.out.println(add2(1,2,3));
        System.out.println(add2(new int[]{2,3,4}));
        System.out.println(add2(null));


        System.out.println("-----------------");

        print(12,"hello","world","beijinig");

        System.out.println("-------------------");

        int[] data=new int[]{1,2,3,4,56};
        for(int i=0;i<data.length;i++){

            System.out.print(data[i]+" ");
        }

        System.out.println();

        //使用foreach循环
        for(int p:data){

            System.out.print(p+" ");

        }

    }
}
