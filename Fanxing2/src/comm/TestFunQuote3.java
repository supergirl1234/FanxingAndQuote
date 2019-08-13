package comm;

interface IInterface3<T,E>{

    public T print(E e1,E e2);

}
public class TestFunQuote3 {

    public static void main(String[] args) {

        /*引用类中普通方法：类名称 :: 普通方法*/
        IInterface3<Integer,Integer> q=Integer::compareTo;
        System.out.println(q.print(1,3));

    }
}
