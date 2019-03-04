package com.imooc.method;

import java.security.PublicKey;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args){
       // Scanner sc=new Scanner(System.in);
        //sc.next();
        //创建一个MethodDemo类的对象myMethodDemo
        MethodDemo myMethodDemo=new MethodDemo();
        myMethodDemo.printStar();
        //System.out.println("***********************************");
        System.out.println("欢迎来到Java的世界！");
        myMethodDemo.printStar();
        //System.out.println("***********************************");
    }
    //打印输出星号的方法
    public void printStar(){
        System.out.println("**********************************");
    }

}
