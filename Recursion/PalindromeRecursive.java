class PalindromeRecursive {

    /*
     * Complete the 'isPalindrome' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static boolean isPalindrome(String s, int i) {
        // Write your code here
        if(i > s.length()/2) return true;
        return s.charAt(i) == s.charAt(s.length()-1-i) && isPalindrome(s, i+1);
    }

    public static void main(String[] args) {

        String s = "malayalamm";
        System.out.println(isPalindrome(s, 0));
    }

}

