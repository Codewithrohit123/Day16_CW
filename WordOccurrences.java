package DAY16_CW;
public class WordOccurrences {
    public static void main(String[] args) {
        String str = "This is a test string. This string contains the word 'this'.";
        String word = "this";

        int count = 0;
        int index = 0;

        while ((index = str.toLowerCase().indexOf(word.toLowerCase(), index)) != -1) {
            count++;
            index += word.length();
        }

        System.out.println("Occurrences of '" + word + "': " + count);
    }
}