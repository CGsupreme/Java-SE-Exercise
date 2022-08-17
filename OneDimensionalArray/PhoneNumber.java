package test_package.OneDimensionalArray;

//手机号码
//通过代码运算出手机号码
public class PhoneNumber {
    public static void main(String[] args) {

        //初始化两个数组，保持一个数组个数为电话号码位数,数值小于另外数组位数即可
        int[] arr1 = new int[] {8,2,1,0,3};
        int[] arr2 = new int[] {2,0,3,2,4,0,1,3,2,3,3};

        String tel ="";
        for(int i = 0;i < arr2.length;i++)
       {
           tel += arr1[arr2[i]];
       }

        System.out.println("电话号码为："+tel);
    }
}
