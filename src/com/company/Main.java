package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        char[] arry= new char[str.length()];
        for(int i=0; i<str.length();i++){
            arry[i]= str.charAt(i);
        }
        System.out.println(Arrays.toString(arry));

        reverse(arry);
        for(char elm: arry)
        System.out.print(elm);
    }

    public static void reverse(char[] arry){
        char first = arry[0];
        char last = (char) ((char) arry.length-1);

        char temp;
        for(int i=0; i<arry.length/2;i++) {
            temp = arry[i];
            arry[i] = arry[last - i];
            arry[last - i] = temp;
        }
    }
}




