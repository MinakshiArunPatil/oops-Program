package Question7;

import java.util.Scanner;

public class StringComparision {
	
		   public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the first string");
		    String s1=sc.next();
		    System.out.println("enter the second string");
		    String s2=sc.next();
		    for(int i=0;i<s1.length();i++)
		    {
		        for(int j=i+1;j<s2.length();j++)
		        {
		            if(s1.charAt(i)==s2.charAt(j))
		            {
		                System.out.println("equal");
		            }
		            else
		            {
		                System.out.println("not equal");
		            }
		        }
		    }
		}

}
