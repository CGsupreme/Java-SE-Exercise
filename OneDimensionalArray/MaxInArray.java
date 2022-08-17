package test_package.OneDimensionalArray;

//数组中找最大值、最大下标、有重复情况下的最大值、最大下标。
public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        //找出最大值
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);

            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        //打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //重复值为
        System.out.println("最大值为"+max);

        //找出重复的最大下标
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == max){
                index = i;
                System.out.print("有重复对应最大下标:"+index+"\t");
            }
        }
    }
}
