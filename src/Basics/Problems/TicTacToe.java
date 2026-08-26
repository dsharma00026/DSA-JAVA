package Basics.Problems;

import java.util.Scanner;

public class TicTacToe {
   static int row=3;
    static int col=3;
    static int[][] numbers=new int[row][col];
    static int turn=1;
    static int  inputCount=0;
    public static void main(String[] args){


        //here we declare  a  2d array variable
        numbers[0][0]=5;
        numbers[0][1]=5;
        numbers[0][2]=5;

        numbers[1][0]=5;
        numbers[1][1]=5;
        numbers[1][2]=5;

        numbers[2][0]=5;
        numbers[2][1]=5;
        numbers[2][2]=5;

       

        printArray();


    }


    
    public static void printArray(){
       
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }
            boolean isWinner=checkWinner();
            if(isWinner){
                System.out.println(turn+"is winnner");
            }
            if(turn==1){
            turn=0;
        }else{
            turn=1;
        }
            getUserInput();
             
    }
    


    public static void getUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number between 1 to 9");
        inputCount++;
        int input=sc.nextInt();
        int count=1;
        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(count==input){
                        if(numbers[i][j]==5){
                        numbers[i][j]=turn;
                      
                        printArray();
                        
                        break;
                        }else{
                            System.out.print("already occupied please ennter another number");
                            inputCount--;
                            getUserInput();
                        }
                    }
                        count++;
                   
                }
            }
            

    }

    public static boolean checkWinner(){
        /**
         * total we have 8 pattern  to win so we solve or cehck  one by one
         */

        if(numbers[0][0]==turn && numbers[0][1]==turn && numbers[0][1]==turn ||
            numbers[1][0]==turn && numbers[1][1]==turn && numbers[1][2]==turn ||
            numbers[2][0]==turn && numbers[2][1]==turn && numbers[2][2]==turn  ||

            numbers[0][0]==turn && numbers[1][0]==turn && numbers[2][0]==turn  ||
            numbers[0][1]==turn && numbers[1][1]==turn && numbers[2][1]==turn  ||
            numbers[0][2]==turn && numbers[1][2]==turn && numbers[2][2]==turn  ||

            numbers[2][0]==turn && numbers[1][1]==turn && numbers[0][2]==turn  ||
            numbers[0][0]==turn && numbers[1][1]==turn && numbers[2][2]==turn  

        ){
            return true;
        }else{

            return false;
        }



    }
    

}
