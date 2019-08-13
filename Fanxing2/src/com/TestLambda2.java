package com;
interface IChat{

    int compare(int arg1,int arg2);
}
public class TestLambda2 {

    public static void main(String[] args) {

        IChat p=new IChat() {
            @Override
            public int compare(int arg1, int arg2) {
                return arg1-arg2;
            }
        };
        System.out.println(p.compare(1,2));

        System.out.println("+++++++++++++");

        IChat m=(arg1,arg2)->arg1-arg2;

        System.out.println(m.compare(2,1));

        System.out.println("+++++++++++++");

        IChat n=(arg1,arg2)->{
            return arg1-arg2;
        };
        System.out.println(n.compare(20,12));
    }
}
