package test_package.OneDimensionalArray;

//统计数字元素个数、偶数个数、总和、平均值
public class CountElements {
    public static void main(String[] args) {
        //在[0,100)范围中生成10个整数存储在数组中
        int[] arr = new int[10];

        int counts = 0; //元素个数
        int even_numbers = 0;   //偶数个数
        int sum = 0;    //总和
        float average = 0; //平均数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            counts++;
            if(arr[i]%2 == 0){
                even_numbers++;
            }
            sum+=arr[i];
        }
        average = sum/arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("元素总数为："+counts);
        System.out.println("偶数为："+even_numbers);
        System.out.println("总和为："+sum);
        System.out.println("平均数为："+average);
    }
}
