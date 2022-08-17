package test_package.OneDimensionalArray;

import java.util.Scanner;

//今天是一年中的第几天
//输入年月日，自动输出是一年中的第几天。用一个数组储存12个月的天数，区分平年和闰年。
public class DayOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("请输入年份：");
        int year = input.nextInt();

        System.out.printf("请输入月份：");
        int month = input.nextInt();

        System.out.printf("请输入日：");
        int day = input.nextInt();

        input.close();

        //平年
        int Months[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        //闰年
        if(month%4 == 0 && month%100 != 0 || month%400 == 0){
            Months[1]=29;
        }

        //计算第几天
        int count = 0;
        //只需要从一年的第二个月开始，第一个月即为输入天数
        //第一个月不会进入循环
        for (int i = 1; i < month; i++) {
            //前n-1个月满
            count += Months[i - 1];
        }

        count += day;

        System.out.println("这天是今年第："+count+"天");

    }
}
