package Basics.Problems;

public class NumberPyramid {
    public static void main(String[]  args){
        int row=10;
        
        for(int i=1;i<=row;i++){

            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            //print numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }

            
            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            //now agian print spaces
            System.out.println();
        }

    }
}
