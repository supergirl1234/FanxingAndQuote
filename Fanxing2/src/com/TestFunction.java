package com;


/*要想使用函数式编程有一个前提：接口必须只有一个方法，如果有两个方法，则无法使用函数式编程。
有一个注解： @FunctionalInterface,就用来表明该接口只有一个方法，子类覆写接口中方法时就可以使用lambda表达式（即函数式编程）；*/
@FunctionalInterface
interface BuyComputer{

    void buy();
}

/*这个接口就不能使用@FunctionalInterface，因为该接口内有两个方法，不能使用函数式编程*/
interface GoShopping {

    void buy();
    void dress();

}
public class TestFunction {

    public static void main(String[] args) {
        BuyComputer person=()-> System.out.println("买MAC电脑");
        person.buy();


        System.out.println("+++++++++++++++++++++");
        GoShopping children=new GoShopping() {
            @Override
            public void buy() {
                System.out.println("买裙子");
            }

            @Override
            public void dress() {
                System.out.println("穿高跟鞋");
            }
        };
        children.buy();
        children.dress();
    }
}
