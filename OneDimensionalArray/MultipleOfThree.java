package test_package.OneDimensionalArray;

//统计3的倍数的个数，产生[0,100)随机整数
public class MultipleOfThree {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            if(arr[i]%3==0){
                count ++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("3的倍数的个数为："+count+"个");
    }

}
