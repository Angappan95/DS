package com.learning.ds.array.practice;

import java.util.Locale;

public class PalindromePhrase {
    public static boolean isPalindrome(String s) {
        boolean flag = true;
        String s1 = s.replaceAll("\\W","").toLowerCase(Locale.ROOT);
        char [] ch = s1.toCharArray();

        for(int i=0; i< ch.length/2; i++){
            if(ch[i] != ch[ch.length-1-i]) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        boolean result;
        result = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
}
