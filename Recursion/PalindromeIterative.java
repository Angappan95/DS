import static java.util.stream.Collectors.joining;

class PalindromeIterative {

    /*
     * Complete the 'isPalindrome' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int isPalindrome(String s) {
        // Write your code here
        char [] ch = s.toCharArray();
        for (int i=0; i<ch.length/2; i++){
            if(ch[i] != ch[ch.length-1-i]) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {

        String s = "malayalamm";
        System.out.println(isPalindrome(s));
    }

}

