package com.imooc.method;

public class AreaDemo {
    //求圆形面积
    double ymj=0.0;
    public double area(double a){

        ymj=Math.pow(a,2)*Math.PI;
        return ymj;
    }
    //求长方形面积
    float cmj=0.0f;
    public float area(float m,float n){

        cmj=m*n;
        return cmj;
    }
    public static void main(String[] args) {
        //定义对象
        AreaDemo areas=new AreaDemo();
        //定义一个double类型的变量存放半径，并初始化
        double a=4.5;
        //定义两个变量存放长和宽，并初始化
        float m=8,n=5;
        //调用方法，求圆的面积并打印输出
        System.out.println("圆的面积是："+areas.area(a));
        //调用方法，求长方形面积并打印输出
        System.out.println("长方形的面积是："+areas.area(m,n));

    }
}
