package com.cg.training.lab3;

import java.util.Scanner;

public class Exercise3 {
	 public String replaceConsonants(String str)
     {
            StringBuffer strbr = new StringBuffer(str);
            for(int i=0;i<str.length();i++)
            {
                   char t = strbr.charAt(i);
                   if(!(t == 'A' || t =='a' || t=='I'||t=='i'||t=='O'||t=='o'||t=='U'||t=='u'||t=='E'||t=='e'))
                   {
                         strbr.replace(i,i+1,String.valueOf((char)(t+1)));
                   }
            }
            return strbr.toString();
     }
     public static void main(String[] ar)
     {
    	 Exercise3  obj = new Exercise3 ();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String: ");
            String str = sc.next();
            System.out.println(obj.replaceConsonants(str));
     }



}
