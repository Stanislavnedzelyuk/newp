public class IsPalindrome {
    public static boolean isPalindrome(String word) {
        int firstChart = 0;
        int lastChart = word.length() - 1;
        while (firstChart < lastChart) {
            if (word.charAt(firstChart) != word.charAt(lastChart)) {
                return false;
            }
            firstChart++;
            lastChart--;
        }
        return true;
    }


    public static void main(String[] args) {
        String word = "radar";
        if (isPalindrome(word)) {
            System.out.println("Слово палиндром");
        } else {
            System.out.println("Слово не палиндром");

        }
    }
}


