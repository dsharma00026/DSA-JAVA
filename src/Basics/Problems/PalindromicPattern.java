package Basics.Problems;

public class PalindromicPattern {
    public static void main(String[]  args){
        int row=9;
        
        for(int i=1;i<=row;i++){

            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            //print numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //print numbers
            for(int j=i;j>=1;j--){
                if(j!=1){
                    System.out.print(j);
                }
            }            
              
           
            
            // for(int j=i+1;j>=1;j--){
            //     System.out.print(j);
            // }

            //now agian print spaces
            System.out.println();
        }

    }
}
