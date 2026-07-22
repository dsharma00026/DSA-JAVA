package Basics.Learning;

import java.util.*;
public class ConditionalStatementsCalculator {

    
    public static void main(String[] args){
        System.out.println("This is Day 3");
        System.out.println("Learn about conditional statement in java");
        /**
         * now here we learn about conditional statement in java
         * like
         * if
         * if else
         * else if
         * switch
         * break
         * continue
         */
        //now we make simple program to check the age of user and print the message if user is eligible for vote or not
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age=sc.nextInt();
        // sc.close();
        // if(age>=18){
        //     System.out.println("You are eligible for vote");
        // }else{
        //     System.out.println("You are not eligible for vote");
        // }

        //now we make simple program to check enter number is even of add
        // System.out.println("Enter Number to check even or odd");
        // int number=sc.nextInt();
        // if(number%2==0){
        //     System.out.println("Number is even");
        // }else{
        //     System.out.println("number is odd");
        // }
        // sc.close();



        /**
         * now here we make a simple calculator program using java 
         */

        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        System.out.println("Enter opreator which you want to perform (+,-,*,/)");
        char opreator=sc.next().charAt(0);

        //here our main logic of calculator program where we use switch
        switch(opreator){
           case '+':
               System.out.println("Addition of two number is: "+(num1+num2));
               break;
           case '-':
                System.out.println("Substraction of two number is:"+(num1-num2));
                break;
           case '*':
                System.out.println("Multiplication of two number is:"+(num1*num2));
                break;
           case '/':
                System.out.println("devide of two number is :"+(num1/num2));
                break;
           default:
                System.out.println("Invalid opreator");
        }
        sc.close();









    }
}
