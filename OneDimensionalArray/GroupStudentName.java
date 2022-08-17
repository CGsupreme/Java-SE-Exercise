package test_package.OneDimensionalArray;

import java.util.Scanner;

//小组成员姓名
//初始化一个数组，存储一个小组的学生姓名，小组人数由学生键盘输入，学生姓名由键盘输入，最后遍历输出学生姓名
public class GroupStudentName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("请输入小组人数：");
        int num = input.nextInt();

        String[] studentName = new String[num];

        for(int i = 0;i < num;i++){
            System.out.printf("请输入第"+(i+1)+"个学生的姓名：");
            String name = input.next();
            studentName[i] = name;
        }

        System.out.println("本小组成员名单如下：");
        for(int i = 0;i < num;i++){
            System.out.printf(studentName[i]+"\t");
        }

        input.close();
    }
}
