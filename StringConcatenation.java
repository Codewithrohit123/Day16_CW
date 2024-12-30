package DAY16_CW;
public class StringConcatenation {
    public static void main(String[] args) {
       
        String str1 = "Hello, ";
        String str2 = "world!";
        String result1 = str1 + str2;

    
        String str3 = "Java";
        String str4 = "Programming";
        String result2 = str3.concat(str4);

        System.out.println("Result1 using(+):" + result1);
        System.out.println("Result2 using concat(): " + result2);
    }
}