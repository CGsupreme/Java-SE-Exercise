package test_package.TwoDimensionalArray;

//杨辉三角
/*
    分析：
        1、每行的第一个数和最后一个数都为 1。
        2、从第三行起符合公式：arr[i][j] = arr[i-1][j-1] + arr[i-1][j]
 */

public class YangHuiTriangle {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = new int[i+1];  //规定每行列数和和行数相等,必须先规定出列数出来
            arr[i][0] = 1;
            arr[i][i] = 1;

            for(int j = 1 ; j < arr[i].length-1 ; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        //打印数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
