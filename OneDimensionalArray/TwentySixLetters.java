package test_package.OneDimensionalArray;

//26个字母
//初始化一个数组，存储26个小写字母，并遍历数组以 a->A 形式输出
public class TwentySixLetters {
    public static void main(String[] args) {
        char[] lower_letter = new char[26];
        char[] upper_letter = new char[26];

        for(int i =0;i < 26;i++){
            lower_letter[i] = (char)(i+97);
            upper_letter[i] = (char)(i+65);
            System.out.println(lower_letter[i]+"->"+upper_letter[i]);
            //System.out.println(lower_letter[i]+"->"+(char)(lower_letter[i]-32));
        }
    }
}
