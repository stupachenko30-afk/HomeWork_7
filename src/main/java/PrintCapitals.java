public class PrintCapitals {




    public static void printCapitals(String s) {
        String[] w = s.split(" ");

        for (String str : w) {
            System.out.print(str.charAt(0));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printCapitals("Hello Course QA 84");
    }
}