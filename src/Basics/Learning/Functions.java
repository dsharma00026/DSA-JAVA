package Basics.Learning;

/**
 * now here  we  learn about function  in java
 * so the function is a block of code which is used to perform a specific task
 * so the structuure of function is like this 
 * returntype functionname(paramethers){
 * condition
 * }
 */

public class Functions {

    public static void  sum(int  a ,int b){
        int sum=a+b;
        System.out.println("the sum of two number is "+sum);
    }

    /**
     * 
     * now we make a program to  print fictorial of a given number using function
     */

    public static int  factorial(int n){
        int sum =1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }


    /**
     * make a fibnocco series function
     */
    public  static void fibnocco(int  a){
        int sum=0;
        int prev=0;
        int next=1;
        System.out.print(prev+" ");
        System.out.print(next+" ");
        for(int i=1;i<=a-1;i++){
            sum=prev+next;
            prev=next;
            next=sum;
            System.out.print(sum+" ");
        }
        return;
        
    }


    /**
     * npw we make a  function to find greates  commond  divisor of two  number
     */
    public  static int gcd(int a, int b){
        int rem=1;
        while(rem!=0){
             rem=a%b;
            if(rem==0){
                return b;

            }else{
                a=b;
                b=rem;
            }
        }
        return 0;

    }

    public static  void  main(String[] args){
        int a=8;
        int result=factorial(a);
        System.out.println("the factorial of given number is "+result);
        fibnocco(a);
        int gcdResult=gcd(36, 30);
        System.out.println("the GCD of 36 and 30 is "+gcdResult);
    }


    
}
