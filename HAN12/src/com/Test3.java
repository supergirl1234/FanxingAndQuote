package com;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Author:Fanleilei
 * Created:2019/2/25 0025
 */
interface IUtil2 {

    //arg1 > arg2 return > 0
    //arg1 < arg2 return < 0
    //arg1 = arg2 return 0
    Integer compare(Integer arg1, Integer arg2);
}
public class Test3 {

        public static void main(String[] args) {
            //匿名内部类的方式
            IUtil2 iUtil=new IUtil2() {
                @Override
                public Integer compare(Integer arg1, Integer arg2) {
                    return arg1-arg2;
                }
            };
            System.out.println(iUtil.compare(10,3));

            //Lambda表达式的方式
            IUtil2 iUtil2=(arg1,arg2)->{

                return arg1-arg2;
            };
            System.out.println(iUtil2.compare(10,11));

            //类::普通方法
            //arg1.compareTo(arg2)
            IUtil2 iUtil21=Integer::compareTo;
            System.out.println(iUtil21.compare(23,23));
            //相当于new Integer(23).compareTo(23)


        }
}
