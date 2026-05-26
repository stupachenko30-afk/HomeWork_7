public class PrintLastReverse {

    public static void printLastReverse(String s) {
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            System.out.print(word.charAt(word.length() - 1));
        }

        System.out.println();
    }

    public static void main(String[] args) {
    printLastReverse("Hello Course QA 84");
}}
