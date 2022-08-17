package test_package.TwoDimensionalArray;

//数字三角形
//动态初始化，不规则二维数组

public class NumericTriangle {
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = new int[i+1];
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = i+j;
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
