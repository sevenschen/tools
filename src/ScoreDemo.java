import java.util.Scanner;

public class ScoreDemo{
    public static void main(String[] args){
        //定义一个三行两列的整型二维数组intArray
        int i,j;
        int[][] intArray=new int[3][2];


        //从键盘输入学生成绩，要求输入顺序与效果图一致
        Scanner s=new Scanner(System.in);

        System.out.println("请输入第1个学生的语文成绩：");
        intArray[0][0]=s.nextInt();
        System.out.println("请输入第1个学生的数学成绩：");
        intArray[0][1]=s.nextInt();
        System.out.println("请输入第2个学生的语文成绩：");
        intArray[1][0]=s.nextInt();
        System.out.println("请输入第2个学生的数学成绩：");
        intArray[1][1]=s.nextInt();
        System.out.println("请输入第3个学生的语文成绩：");
        intArray[2][0]=s.nextInt();
        System.out.println("请输入第3个学生的数学成绩：");
        intArray[2][1]=s.nextInt();

        //求语文的总成绩和平均分
        int sum=0,avg=0;
        for(i=0;i<intArray.length;i++){
            sum=sum+intArray[i][0];
            avg=sum/intArray.length;

        }

        System.out.println("语文的总成绩为："+sum);
        System.out.println("语文的平均分为："+avg);

        //求数学的总成绩和平均分
        int sum1=0,avg1=0;
        for(i=0;i<intArray.length;i++){
            sum1=sum1+intArray[i][1];
            avg1=sum1/intArray.length;
        }
        System.out.println("数学的总成绩为："+sum1);
        System.out.println("数学的平均分为："+avg1);


    }
}
