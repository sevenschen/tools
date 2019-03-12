package com.imooc.object;


public class Test2 {
    // 测试方法
    public static void main(String[] args) {
        //实例化对象，调用相关方法实现运行效果
        User one=new User();
        one.setName("Lucy");
        one.setPassword("123456");
        User two=new User();
        two.setName("Mike");
        two.setPassword("123456");
        one.show();
        two.show();
        System.out.println("========================");
        UserManager check=new UserManager();
        check.checkUser(one,two);





    }
}
