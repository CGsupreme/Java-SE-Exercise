package test_package.OneDimensionalArray;

import java.util.Scanner;

//二分查找
/*
    条件：数组为有序数组
    1、标记首尾元素和中间元素，left、right、mid
    2、需要查找元素和 mid 比较。
    3、大于mid: left移至mid+1。 小于mid:right移至mid-1。
    4、循环查找，条件为 left <= right。
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要查找的数：");
        int num = input.nextInt();

        int[] arr = new int[]{13,14,17,20,59};
        int flag = -1;
        int index = -2;
        for(int left = 0,right = arr.length - 1;left <= right;){
            int mid = left + (right - left)/2;
            if(num == arr[mid]){
                flag = 1;
                index = mid;
                break;
            }
            if(num < arr[mid]){
                right = mid-1;
            }
            if(num > arr[mid]){
                left = mid+1;
            }
        }
        if(flag == 1){
            System.out.println("找到了，下标为："+index);
        }else {
            System.out.println("没有找到");
        }
    }
}
