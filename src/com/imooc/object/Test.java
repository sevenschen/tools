package com.imooc.object;

    public class Test {


        public static void main(String[] args) {
            //使用new关键字实例化对象
            Person m=new Person();
            //传入name、age、grade的参数值
            m.name ="李明";
            m.age=10;
            m.grade="五年级";
            //分别调用student、sex、mySelf方法
            m.student();
            m.sex("男");
            m.mySelf();
        }
        public static class Person{
            String name;
            int age;
            String grade;

            public void student(){
                System.out.println("我是一名学生!");

            }
            public String sex(String a){
                System.out.println("我是一个"+a+"孩!");
              return a;
            }
            public void mySelf(){
                System.out.println("我叫"+name+","+"今年"+age+"岁了,"+"读小学"+grade+"了。");


            }



    }
}
