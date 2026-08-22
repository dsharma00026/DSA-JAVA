package Basics.Problems;

public class SolidRhombus {
    public  static void main(String[] args){
        int row=10;

        int count=row-1;
        for(int i=1;i<=row;i++){
            //for spaces
            for(int j=1;j<=count;j++){
                System.out.print("-");
            }
            //first half
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
            count--;
        }

    }
}
