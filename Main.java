import java.util.*;

// public class Main{
//     public static void main(String[] args){
//         System.out.println("hello world");
//         System.out.println("hello world");


//         //print a patttern
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");        
//             }
//             System.out  .print("\n");
//         }
//     }
// }


/**
 * learn about vairable in java
 */
public class Main{
    public static void main(String[] args){

        
       /**
        * in java we have 2 type of data type
        * 1.  is primitvi data type its are 8 type of data type
        * 2.  is non-primitve data type its are many type of data type
        * 
        * primitve data type are
        * 1.   byte 
        * 2.   short
        * 3.   Integer (4bytes)
        * 4.   Long (8bytes)
        * 5.   float (4bytes)
        * 6.   double (8bytes)
        * 7.   char (2bytes)
        * 8.   boolean (1bit)
        * 
        * 
        * not premitive data type are
        * 1.   String
        * 2.   Array
        * 3.   Class
        * 4.   Object
        * 5.   Interface
        */


       //we  have many type of variable like below
       int a=10;//integer variable
       float b=10.5f;//float variable
       double c=10.25;//double variable
       String d="hello world";//string variable
       boolean e=true;//boolean variable
       char f='A';//char variable



       //print the variable
       System.out.println("integer variable: "+a);
       System.out.println("float variable: "+b);
       System.out.println("double variable: "+c);
       System.out.println("string variable: "+d);
       System.out.println("boolean variable: "+e);
       System.out.println("char variable: "+f);

       //we also reassing   value  in  variable but we have to use the same type of variable
       a=20;
       System.out.println("reassigned integer variable: "+a);

       int x=10;
       int y=5;
       int ans=x*y / x-y;
       System.out.println("ans 1 : "+ans);

       ans=(x*y) / (x-y);
       System.out.println("ans 1 : "+ans);

       /**
        * in java language bodmas rule not follow its has own rule of opreaton  folow
        * like they always prieprtize * / % over + - also they alwasy solve the expression from left tto right
        */


       /**
        * now here we learn about how to get input from the user in java and store into variable
        * for  use input from user  we have  to  improt  scanner class from java.util package
        */
       //first we have to create an object of scanner class
       Scanner sc=new Scanner(System.in);
       int k = sc.nextInt();
       System.out.println("user input integer variable: "+k);

       /**
        * now we create a program where  we get two  number from user and print sum of number
        */
       System.out.println("enter First  number: ");
       int num1=sc.nextInt();
       System.out.println("enter Second  number: ");
       int num2=sc.nextInt();
       int sum=num1+num2;
       System.out.println("sum of two number is: "+sum);



       
    }
}