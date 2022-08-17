package test_package.OneDimensionalArray;

import java.util.Scanner;

//找出最高分同学的姓名
//一个小组，两个数组，一个存储姓名，一个存储成绩，小组人数，均有键盘输入，最后遍历数组找出最高成绩同学的姓名和成绩。
public class StudentHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入小组人数：");
        int count = input.nextInt();

        //定义成绩和姓名两个数组
        String[] names = new String[count];
        int[] scores = new int[count];

        for(int i = 0;i < count;i++){
            System.out.println("第"+(i+1)+"个同学的名字为：");
            String name = input.next();
            names[i] = name;

            System.out.println("第"+(i+1)+"个同学的成绩为：");
            int score = input.nextInt();
            scores[i] = score;
        }

        int max = scores[0];
        int index = 0;
        for(int i = 0;i < count;i++){
            if(scores[i]>max){
                max = scores[i];
                index = i;
            }
        }

        System.out.println("最高分同学姓名为："+names[index]);
        System.out.println("最高分同学成绩为："+max);

    }
}
