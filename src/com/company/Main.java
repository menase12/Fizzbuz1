package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        Scanner number=new Scanner(System.in);
        System.out.print("Please enter your number: ");
               i=number.nextInt();
               if(i<=1){
                   System.out.print("PLease enter again your number greater than one ");
                            i=number.nextInt();}
               else
                for (int j = 1;j <= i; j++) {

                    //System.out.println(j);
                    if(j % 3 == 0 && j%5==0) {
                        System.out.println ("FizzBuzz");}
                    else if (j % 5 == 0) {
                        System.out.print("Buzz \n");
                    }
                    //System.out.println(j);

                    else if (j % 3 == 0)
                    {
                        System.out.print("Fizz \n");
                    }

                    else if (j%3!=0 && j%5!=0 && j % 10 != 0){
                        System.out.println(j);

                    }

                }

System.out.printf ("The number of multiplies of 7 is:    %d \n",i/7);
System.out.printf ("The number of multiplies of 17 is:   %d \n", i/17);
System.out.printf ("The number of multiplies of 23 is:   %d \n", i/23);

}
}



