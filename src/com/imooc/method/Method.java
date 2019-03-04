package com.imooc.method;

public class Method {
    public String show(String name){
        String oneSelf =name+"今年7岁了";
        return oneSelf;
    }
    public static void main(String[] args){
        Method method=new Method();
        System.out.println(method.show("晓明"));
    }
}
