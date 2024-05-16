package com.last.spring.studyreport.oops;

import java.io.*;
import java.util.*;
/*
lowsalt
owlslat
anagram
Margana  */
public class HackerRank {

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
    }
     static boolean isAnagram(String a, String b) {
        if(a.length() > 50 || b.length() >50)
            return false;
        char[] aa = a.toLowerCase().toCharArray();
        char[] bb = b.toLowerCase().toCharArray();
        
        final int len = aa.length;
        //3,1,4
        for(int i=1; i<len; i++){
            char temp = aa[i];
            if(aa[i-1] < aa[i])
                aa[i] = temp;
        }
        return Arrays.equals(aa, bb);
    }
   
}