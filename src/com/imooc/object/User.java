package com.imooc.object;

public class User {
    //定义属性用户名、密码
    private String name;
    private String password;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void show(){
        System.out.println("用户名："+this.getName());
        System.out.println("密码："+this.getPassword());
    }




}
