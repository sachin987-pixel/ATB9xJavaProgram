package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

public class RemoveWhiteSpaces {
    public static void main(String[]args){
        String str ="Geek for Geeks";
        str = str.replaceAll("\\s", ""); // str.replaceAll("\\s"," ");
        //sout "SWP: " +str + ""
        System.out.println("SWS: " +str + "'");

    }
}
