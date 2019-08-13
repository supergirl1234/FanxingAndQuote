package comm;

interface IInterface1 {

    public void print(int p);
}
public class TestFunQuote1 {

    public static void main(String[] args) {
        /*引用静态方法：类名称::static 方法名称*/
        IInterface1 p=String :: valueOf;//意思就是要覆写的接口方法，你想要怎么实现
        p.print(100);//相当于调用了String.valueOf(100)

    }

}
