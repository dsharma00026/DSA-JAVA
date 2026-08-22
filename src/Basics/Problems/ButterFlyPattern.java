package Basics.Problems;

public class ButterFlyPattern{

    public static  void main(String[] args){
        int row=5;
        //below  logic is mine  and now try another logic
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=row;j++){
        //         if(j<=i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print("-");

        //         }
        //     }

        //     for(int k=row;k>=1;k--){
        //         if(k<=i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print("-");

        //         }
        //     }

        //     System.out.println();
        // }

        //  for(int i=1;i<=row;i++){
        //     for(int j=row;j>=1;j--){
        //        if(j>=i){
        //            System.out.print("*");
        //        }else{
        //            System.out.print("-");
        //        }
               
        //     }

        //     for(int k=1;k<=row;k++){
        //        if(k>=i){
        //            System.out.print("*");
        //        }else{
        //            System.out.print("-");
        //        }
               
        //     }

        //     System.out.println();
        // }
      

        for(int i=1;i<=row;i++){
            //first half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2*(row-i);
            for(int j=1;j<=spaces;j++){
                System.out.print("-");
            }

            //second half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
          for(int i=row;i>=1;i--){
            //first half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2*(row-i);
            for(int j=1;j<=spaces;j++){
                System.out.print("-");
            }

            //second half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        





    }
}