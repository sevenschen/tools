public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个字符数组ch并初始化
        char[] m={'s','h','a','d','f','a','h','a','j','d','h','d','A'};
        int sum=0;

        //循环遍历数组，统计字符’a’或’A’出现的次数
        for(int i=0;i<m.length;i++){
            if(m[i]=='a'||m[i]=='A'){
                sum++;
            }

        }


        //打印输出统计数据
        System.out.println(sum);
    }
}