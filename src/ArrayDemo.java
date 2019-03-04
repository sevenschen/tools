import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //定义一个整型数组，并初始化
        int[] n={1,2,6,12,14,15};
        //循环遍历数组，找出能被3整除的元素并打印输出
        for(int i=0;i<n.length;i++){

            if((n[i]%3)==0){
                System.out.println(n[i]);
            }
        }

    }
}
