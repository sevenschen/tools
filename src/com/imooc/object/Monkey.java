package com.imooc.object;

public class Monkey {
    //属性：姓名（name）、特征（feature）
    String name;
    String feature;
    //无参的构造方法（默认初始化name和feature的属性值，属性值参考效果图）
    public  Monkey(){
        System.out.println("我是使用无参构造产生的猴子：");
        name="长尾猴";
        feature="尾巴长";
    }
    //带参的构造方法（接收外部传入的参数，分别向 name 和 feature 赋值）
    public Monkey(String name, String feature){
        System.out.println("我是使用带参构造产生的猴子：");
        this.name=name;
        this.feature=feature;

    }


}
