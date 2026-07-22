import java.util.Scanner;
public class Day4{
    public static void main(String[] args){
        System.out.println("Today is day 4 of java and today we learn about loop in java ");


        /**
         * we have 3 type of loop in java 
         * for loop 
         * while loop
         * do while loop
         */

        //we create a program using for loop where user enter a numbr and we print table of that number

        //first  we get number from user
        
        Scanner sc=new Scanner(System.in);
        print("Enter a number to print table");
        int number=sc.nextInt();
        //now here our core logic to print table

        /**
         * first we do this in for loop
         */
        // for(int i=1;i<=10;i++){
            //     print(number+" * "+i+" =" +(number*i));
            // }
            
            //now we do this in while loop
            // int i=1;
            // while(i<=10){
            // print(number+" * "+i+" =" +(number*i));
            // i++;

            //now we do this in do while loop
            int i=1;
            do{
                print(number+" * "+i+" =" +(number*i));
                i++;
            }while(i<=10);
            sc.close();
        }


    public static void print(String str){
        System.out.println(str);

    }
}

