package comm;

class Person{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

interface IInterface4<S,T,E>{
    public S print(T t,E e);
}
public class TestFunQuote4 {

    public static void main(String[] args) {

        /*引用类中构造方法：类名称 :: new 。 */
        IInterface4<Person,String,Integer> n=Person::new;
        System.out.println(n.print("张杰",40));


    }
}
