package test_package.TwoDimensionalArray;

//数字矩形
//动态初始化，规则二维数组

public class NumericRectangle {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = i+1;
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
