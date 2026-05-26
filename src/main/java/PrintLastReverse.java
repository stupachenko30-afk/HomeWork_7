public class PrintLastReverse {

    public static void printLastReverse(String s) {
        String[] w = s.split(" ");

        for (int i = w.length - 1; i >= 0; i--) {
            String str = w[i];
            System.out.print(str.charAt(str.length() - 1));
        }

        System.out.println();
    }

    public static void main(String[] args) {
    printLastReverse("Hello Course QA 84");
}}
