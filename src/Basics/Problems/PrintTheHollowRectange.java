package Basics.Problems;

public class PrintTheHollowRectange {
    public static void main(String[]  args){
        int row=4;
        int col=8;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row){
                    System.out.print("*");
                }

                if(i>1&&i<row){
                    if(j==1||j==col){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

    