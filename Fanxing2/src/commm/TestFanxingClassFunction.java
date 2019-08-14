package commm;

public class TestFanxingClassFunction<T> {


    /*泛型方法中的参数与泛型类的参数没有关系*/
    public <E> void print1(E e) {
        System.out.println(e);

    }

    public <T> T print2(T t) {
        return t;

    }

    public static void main(String[] args) {

        //TestFanxingClassFunction t=new TestFanxingClassFunction();
        TestFanxingClassFunction<String> t=new TestFanxingClassFunction<>();
        t.print1(12);
        System.out.println(t.print2("haha"));
    }

}
