import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        //定义变量ge、shi、bai，用于存放个位、十位、百位上的数字
        int ge,shi,bai,he = 0,ji=0;
        int n;


        //使用for循环
        for(n=200;n<300;n++)
        {

            //取出百位数
            bai=n/100;

            //取出十位数
            shi=(n/10)%10;

            //取出个位数
            ge=n%10;

            //计算三个数字之积
            ji=bai*shi*ge;

            //计算三个数字之和
            he=bai+shi+ge;

            //如果积等于42并且和为12，则将满足条件的数输出
            if((he==12)&&(ji==42)){
                System.out.println(n);
            }

        }

    }
}
