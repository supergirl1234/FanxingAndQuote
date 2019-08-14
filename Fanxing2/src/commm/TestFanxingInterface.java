package commm;

 interface Iss<T> {

    /*泛型接口中的普通方法的参数类型也要和泛型接口的类型参数一样*/
    void print(T e);

}

public class TestFanxingInterface{
    public static void main(String[] args) {

        Iss<String> iss= new Iss<String>() {
            @Override
            public void print(String e) {
                System.out.println(e);
            }
        };

        iss.print("string");

        Iss<Integer> p=(arg)-> System.out.println(String.valueOf(arg));
        p.print(12);
    }

}
