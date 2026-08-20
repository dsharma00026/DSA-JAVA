package Basics.Problems;
import java.util.Scanner;

public class PrintTheSolidRectangle {
    public static void  main(String[] args){
        int row=4;
        int col=5;
        String str="";
        // System.out.println("enter row");
        // Scanner sc=new Scanner(System.in);
        // row=sc.nextInt();
        // System.out.println("enter coloum");
        // col=sc.nextInt();
        // sc.close();
        for(int i=0;i<row;i++){
            str="";
            for(int j=0;j<col;j++){
                // System.out.print("*");
                str=str+"*";
            }
            System.out.println(str);

        }

    }
}
