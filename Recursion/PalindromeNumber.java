public class PalindromeNumber {
    public static boolean isPalindromeNum(int num){
        int reversedNum=0;
        int tempNum = num;
        while (tempNum > 0){
            tempNum = tempNum/10;
            reversedNum = reversedNum*10 + tempNum%10;
        }
        return num == reversedNum;
    }


    public static void main(String[] args) {
        System.out.println(isPalindromeNum(121));
        System.out.println(isPalindromeNum(122));
        System.out.println(isPalindromeNum(1));
    }
}
