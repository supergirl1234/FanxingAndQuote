package commm;

public class TestFanxingClassFunction2<T> {


    /*这是泛型类中的普通方法。这个里面的T 是和泛型类中的参数一样的*/
    public void testMethod1(T e) {
        System.out.println(e);
    }

    public static void main(String[] args) {
        TestFanxingClassFunction2<String>  test=new TestFanxingClassFunction2<>();
        test.testMethod1("haheas");//泛型类中的这个方法参数要与泛型类的类型相同
        //test.testMethod1(12);这个就是错误的
    }
}
