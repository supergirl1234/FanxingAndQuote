package commm;

public class TesstFanxingClass<T,S> {

    public T p1;
    public S p2;

    public TesstFanxingClass(T p1, S p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "TesstFanxingClass{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public static void main(String[] args) {

        TesstFanxingClass<String,Integer> p=new TesstFanxingClass<>("张三",12);
        System.out.println(p);
    }
}
