package test_package.OneDimensionalArray;

import java.util.Scanner;

//星期
//初始化一个数组保存一周的英文字母用户输入1-7对应星期输出
public class Week{
    public static void main(String[] args) {

        String[] days = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.printf("请输入数字(1-7):");
            int day = input.nextInt();

            if (day < 1 || day > 7) {
                System.out.println("输入错误");
            } else {
                System.out.println("今天是：" + days[day - 1]);
                break;
            }
        }

        input.close();
    }

}
