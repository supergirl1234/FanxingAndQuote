package comm;


interface IInterface2{

    public String print();

}
public class TestFunQuote2 {

    public static void main(String[] args) {

        /*引用实例对象的方法：实例对象::普通方法*/
        IInterface2 m="leoahhe"::toUpperCase;
        System.out.println(m.print());
    }
}
