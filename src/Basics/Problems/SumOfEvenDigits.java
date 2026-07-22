package Basics.Problems;

public class SumOfEvenDigits {
    public static  void main(String[] args){
    //Given an integer n, print (ya return) the sum of all even digits present in the number.
        int number=2468;
        int sum=0;
        // boolean getAnswered=false;

        while(number > 0){
            int  digit=number%10;
            int rem=number/10;
            if(digit%2==0){
                sum=sum+digit;
            }
            number=rem;

            // }if(number>10){
            //     number=rem;
            // }else{
            //     getAnswered=true;
            // }
        }

        System.out.println("out put is:"+sum);


    }
}
