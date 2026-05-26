public class PrintCapitals {




    public static void printCapitals(String s) {
        String[] w = s.split(" ");

        for (String word : w) {
            System.out.print(word.charAt(0));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printCapitals("Hello Course QA 84");
    }
}