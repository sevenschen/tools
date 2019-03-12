package com.imooc.object;

public class UserManager {
    // 用户信息验证的方法
    public void checkUser(User one, User two) {
        // 判断用户名是否为空，是否一致

        if(one.getName().isEmpty()&two.getName().isEmpty()){
            System.out.println("用户名为空");

        }else if (one.getName().equals(two.getName())){
            System.out.println("用户名一致");
        }else {
            System.out.println("用户名不一致");
        }

        // 判断密码是否为空，是否一致
        if(one.getPassword().isEmpty()&two.getPassword().isEmpty()){
            System.out.println("密码为空");

        }else if (one.getPassword().equals(two.getPassword())){
            System.out.println("密码一致");
        }else {
            System.out.println("密码不一致");
        }


    }
}
