package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

public class ReverseString {

    public  static void  main (String[] args){
         String InputString = "SachinMahajan";
         String OutputString = " ";

         for(int i= InputString.length()-1; i>=0; i--){
             OutputString = OutputString + InputString.charAt(i);


         }
        System.out.println(OutputString);


    }
}
