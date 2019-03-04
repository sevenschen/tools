package com.imooc.method;

public class AverageDemo{
    //求数组元素的平均值
        public void aver(float[] a){
            float sum=0.0f;
            float aver=0.0f;

        for(int i=0;i<a.length;i++){

            sum=a[i]+sum;
        }
           aver=sum/a.length;

        System.out.println(aver);

        }




    public static void main(String[] args) {
        //定义对象
        AverageDemo average =new AverageDemo();


        //创建float类型的数组并初始化
        float[] a={78.5f,98.5f,65.5f,32.5f,75.5f};

        //调用方法求平均值并打印输出
        average.aver(a);



    }
}
