package com.imooc.method;

import java.util.Scanner;

public class DisCountDemo {
    //根据商品总价输出折后总价
    public void TotalCount(float a){

        float endcount=0;
        if(a>200){
            endcount=a;

        }else if(a>100){
            endcount=a*0.95f;
        }else{
            endcount=a*0.85f;
        }
        System.out.println("折后商品总价为:"+endcount);

    }
    public static void main(String[] args){
        //定义对象
        DisCountDemo discount=new DisCountDemo();
        //定义商品总价存放到变量中
        Scanner sc= new Scanner(System.in);
        float price=sc.nextInt();

        //调用方法，输出折后商品总价
        discount.TotalCount(price);
        //System.out.println("折后商品总价为："+discount.TotalCount());


    }
}
