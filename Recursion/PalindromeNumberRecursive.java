public class PalindromeNumberRecursive {
    public static int reverseNum(int num, int temp){
//        int reversedNum=0;
//        int tempNum = num;
//        while (tempNum > 0){
//            tempNum = tempNum/10;
//            reversedNum = reversedNum*10 + tempNum%10;
//        }
//        return num == reversedNum;

        if (num == 0) return temp;
        return reverseNum(num/10, temp*10 + num%10);
    }
    

    public static void main(String[] args) {
        System.out.println(121 == reverseNum(121, 0));
        System.out.println(122 == reverseNum(122, 0));
        System.out.println(-11 == reverseNum(-11, 0));
        System.out.println(-1 == reverseNum(-1, 0));
    }
}
