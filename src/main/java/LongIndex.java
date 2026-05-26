public class LongIndex {

    public static void main(String[] args) {
        System.out.println(longestBlockIndex("ccbbbdddda"));}


    public static int longestBlockIndex(String s) {
        int maxStart = 0;
        int maxLength = 1;

        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = currentStart;
                }

                currentStart = i;
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxStart = currentStart;
        }

        return maxStart;
    }
}
