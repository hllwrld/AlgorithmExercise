package com.hllwrld.AlgorithmExercise;

import java.util.Collections;

public class NoDupArray {


    public static char[] getNoDupArray(char[] chars) {

        int l = 0;
        int r= 0;
        int i=0;
        int j=0;
        int[] charMap = new int[256];
        while (j < chars.length) {
               if (charMap[chars[j] - 'a'] > 0) {
                  i = j;
                  for (int k=0;k<charMap.length;k++) {
                      charMap[k] = 0;
                  }
               } else {
                  charMap[chars[j] -'a'] ++;
                  if (j - i > r - l) {
                      l =i;
                      r = j;
                  }
                  j++;
               }
        }
        char[] ret = new char[r- l+1];
        for (i = l;i<=r;i++) {
           ret[i - l] = chars[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        char[] ret = getNoDupArray(new char[] {'a','b','c','a','f','b','c','e','m','e','a'});
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]+",");
        }

    }
}
