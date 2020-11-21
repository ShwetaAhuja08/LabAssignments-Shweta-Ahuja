package com.cg.training.lab1;

import java.util.Scanner;

class Function
	{         
	     void nonrecursivefunc(int a,int b,int c,int m)
	            {
	                        for(int i=1;i<=m-2;i++)
	                        {
	                                    c=a+b;
	                                    a=b;
	                                    b=c;
	                        }
	                        a=b=1;
	                        System.out.println("nth value in the series using non recursive function : "+c);
	                       
	            }
	            void  recursivefunc(int a,int b,int c,int m)
	            {
	                                   
	                        if(m-2>0)
	                        {
	                                    c=a+b;
	                                    a=b;
	                                    b=c;
	                                    recursivefunc(a,b,c,m-1);
	                                    return;
	                        }
	                       
	                        System.out.println("\n nth value in the series using recursive function : "+c);
	            }
	}
	           
class Exercise3
{
            public static void main(String args[])
            {
                        Function f=new Function();
                        int m,a=1,b=1,c=0;
                        Scanner scr=new Scanner(System.in);
                        System.out.println("Enter a value:  ");
                        m=scr.nextInt();
                        f.nonrecursivefunc(a,b,c,m);
                        f.recursivefunc(a,b,c,m);
                       

            }
}


