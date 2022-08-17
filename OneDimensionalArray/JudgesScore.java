package test_package.OneDimensionalArray;

import java.util.Scanner;

//评委打分
//是个评委打分，最后去掉最高分和最低分，其余八位评委总分的平均分即为所得分。
public class JudgesScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0;i < arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个评委成绩：");
            int score = input.nextInt();
            arr[i] = score;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+"\t");
        }

        //找出最大值、最小值，用总分减去。
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println();
        System.out.println(sum);
        System.out.println("最后所得平均分为："+(sum-min-max)/(arr.length-2));
        input.close();
    }
}
