package test_package.OneDimensionalArray;

import java.util.Scanner;

//顺序查找
//输入需要查找的数是否在数组中，逐一比对后返回是否存在。
public class SequentialSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("请输入需要查找的数：");
        int num = input.nextInt();

        int[] arr = new int[10];
        int index = 0;
        int flag = 0;   //不存在不好表示，故使用标志
        System.out.printf("该数存在"+"下标为：");
        for(int i = 0;i <arr.length;i++){
            arr[i] = (int)(Math.random()*10);
            if(num == arr[i]){
                    index = i;
                    System.out.printf(index+"\t");
                    flag = 1;
            }
        }

        if(flag != 1) {
            System.out.println("该数不存在");
        }

        System.out.println();
        //打印数组
        System.out.println("数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+"\t");
            }

    }
}
