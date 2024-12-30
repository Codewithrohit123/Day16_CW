package DAY16_CW;
public class StringSplit {
    public static void main(String[] args) {
        String str = "HELLO$WORLD";
        String[] tokens = str.split("\\$"); 

        if (tokens.length == 2) {
            System.out.println("Token 1: " + tokens[0]);
            System.out.println("Token 2: " + tokens[1]);
        } else {
            System.out.println("String could not be split into 2 tokens.");
        }
    }
}