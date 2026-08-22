package Basics.Problems;

public class DiamondPattern {
    public static void main(String[] args){

        int row=12;

        //this is first half of the diamond pattern
        for(int i=1;i<=row;i++){
            //first we print spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            //now print 1st half star
            for(int j=i;j>=1;j--){
                System.out.print("*");

            }

            //now we print 2nd half star
            for(int j=1;j<=i;j++){
                if(j!=1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }


         //this is second half of the diamond pattern
        for(int i=row;i>=1;i--){
            //first we print spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            //now print 1st half star
            for(int j=i;j>=1;j--){
                System.out.print("*");

            }

            //now we print 2nd half star
            for(int j=1;j<=i;j++){
                if(j!=1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
