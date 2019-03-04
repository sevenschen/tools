import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


//        int n=789;
//        int a;
//        a=(n-n%10)/100;
//        int b=n%10;
//        int c=n/10%2;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//

//运算符
//        System.out.println("请输入一个整数：");
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        if(n%2==0){
//            System.out.println(n+"是偶数！");
//        }else {
//            System.out.println(n+"是奇数！");
//    }

     /*   //三目运算符

            int a=10,b=7;
            int max;
            max=a>b?a:b;//三目运算符，如果a>b.则max是a
            System.out.println("max="+max);
            boolean b1=a>b?(3<6|3<1):(true==false);
            System.out.println("b1="+b1);
            */
   /*  int a=5,b=4,c=3,d=2;
     if(a>b&&b>c){
         System.out.println(d);
     }
     else if((c-1>=d)==1){                   //boolean值是不能和整型数据进行比较的
         System.out.println(d+1);
     }else {
         System.out.println(d+2);
     }
     */


   int x=6,y=10,k=5;
   System.out.println(x%y);
   System.out.println(x/y);



/*
        char ch='a';

        //使用switch结构判断是否为元音字母，并输出对应的信息
        switch(ch){
            case'a':System.out.println("元音字母"+ch);break;
            case'e':System.out.println("元音字母"+ch);break;
            case'i':System.out.println("元音字母"+ch);break;
            case'o':System.out.println("元音字母"+ch);break;
            case'u':System.out.println("元音字母"+ch);break;
            default:System.out.println("不是元音字母");
        }

        */

        char ch='a';
        int count=1;
        while(ch<='z'){                  //如果在小括号后面加了个分号，则会循环进入死循环
            System.out.print(ch+" ");
            if(count%13==0){
                System.out.println();
            }
            count++;
            ch++;
        }


        int j=0;
        for(int i=3;i>0;i--){
            j+=i;
            System.out.println(j);
        }



    }
}
