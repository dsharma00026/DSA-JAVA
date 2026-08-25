package Basics.Learning;
import java.util.Scanner;
public class Array {

    /**
     * today we learn about array in java
     * to initialize an array we use the following syntax
     * datatype[] arrayname=new datatype[size];
     * 
     */
    public static void main(String[] args){
        //first we simple initialize an array of integear type and print the value of array
        // int[] arr=new int[3];
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;

        // System.out.println("the value of array is "+arr[0]+" "+arr[1]+" "+arr[2]);

        /**
         * now  we make an array of integer and  assign the valeuand after sort the array and print
         */
        // int[] arr=new int[]{10,5,45,7,6,8};

        // //now  we first sort  the array
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }

        //     }

        // }

        // //now  we  print the array
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }


        /**
         * now  we make a  prgram where we get x number of input fro user after we get serach number from user and print tha index of that number in aaray
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];

         /**
          * first get value ofarray from  user
          */
         for(int i=0;i<size;i++){
            System.out.println("enter  the "+(i+1)+" value of array at index ");
            arr[i]=sc.nextInt();
         }

         /**
          * now here  we get the  saerchnumber from user
          */
         System.out.println("Now we get all  number now enter search  number ");
         int search=sc.nextInt();
         sc.close();
         /**
          * now  we  search  the numnner in  array
          */
         int index=-1;
         for(int i=0;i<size;i++){
            if(arr[i]==search){
                System.out.println("the number is found at index "+i);
                index=i;
                break;
            }
         }
         if(index==-1){
            System.out.println("the number is not found in array");

         }
    }
}
