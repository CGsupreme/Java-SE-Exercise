package test_package.TwoDimensionalArray;

//员工信息输入
//将员工信息保存到二维数组,再以表格形式输出
//其中"10"代表普通职员，"11"代表程序员，"12"代表设计师，"13"代表架构师

public class EmployeeInformation {
    public static void main(String[] args) {
        //将员工信息储存到二维数组
        String[][] arr = new String[][]{
                {"10", "1", "段誉 ", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏 ", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过 ", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭靖 ", "25", "7100"},
                {"12", "12", "黄蓉 ", "27", "9600", "4800"}
        };

        //遍历二维数组需要两层for循环
        System.out.println("员工类型\t\t编号\t\t姓名\t\t\t年龄\t\t薪资\t\t\t奖金\t\t\t股票\t");
        for(int i = 0 ; i < arr.length ; i++){
            //使用switch分支语句，不同数字分配不同职位
            switch(arr[i][0]){
                case "10":
                    System.out.printf("普通员工");
                    break;
                case "11":
                    System.out.printf("程序员");
                    break;
                case "12":
                    System.out.printf("设计师");
                    break;
                case "13":
                    System.out.printf("架构师");
                    break;
            }

            //第一列要输出员工类型，故从第二列开始
            for(int j = 1 ; j < arr[i].length ; j++){
                System.out.printf("\t\t"+arr[i][j]);
            }
            System.out.println();
        }
    }
}
