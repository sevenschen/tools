package com.imooc.object;

public class Test1 {

    public static void main(String[] args) {

        //调用无参构造方法实例对象
          Monkey ab=new Monkey();

        //打印输出对象属性
        System.out.println("名称："+ab.name);
        System.out.println("特征:"+ab.feature);
        System.out.println("==============================");

        //调用带参构造方法实例对象
        Monkey ac=new Monkey("白头叶猴","头上有白毛，喜欢吃树叶");
        //打印输出对象属性
        System.out.println("名称："+ac.name);
        System.out.println("特征:"+ac.feature);


    }
}
