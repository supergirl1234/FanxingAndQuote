package com;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */
@FunctionalInterface
interface IUtil3 {

    Person createPerson(String name, Integer age);
}

public class Test4 {

        public static void main(String[] args) {

            IUtil3 iUtil3=new IUtil3() {
                @Override
                public Person createPerson(String name, Integer age) {
                    return new Person(name,age);
                }
            };
            Person person=iUtil3.createPerson("张杰",13);
            System.out.println(person.toString());

            IUtil3 iUtil31=(name,age)->{
                return new Person(name,age);

            };

            //构造方法引用
            IUtil3 iUtil32=Person::new;
            Person person1=iUtil3.createPerson("JACK",14);
            System.out.println(person1.getPersonInfo());

        }
}
