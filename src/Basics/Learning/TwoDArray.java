package Basics.Learning;

public class TwoDArray {
    public static void main(String[] args) {

        /**
         * here we learn about 2d  array in java
         * structire to make 2d array
         * datatype[][] arrayName=new Datatype[row][coloum];
         */

        int row=3;
        int col=3;
        //here we declare  a  2d array variable
        int[][] numbers=new int[row][col];
        numbers[0][0]=0;
        numbers[0][1]=0;
        numbers[0][2]=0;

        numbers[1][0]=0;
        numbers[1][1]=0;
        numbers[1][2]=0;

        numbers[2][0]=0;
        numbers[2][1]=0;
        numbers[2][2]=0;


        /**
         * print 2d array
         */

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();

        // }

        //search in 2d array


        // int search=9;
        // boolean isFound=false;
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         if(numbers[i][j]==search){
        //             System.out.println("index  is "+i+j);
        //             isFound=true;
        //             break;
        //         }
        //     }
            
        // }
        // if(isFound==false){
        //     System.out.println("number not avaiable in array");
        // }

    }




    public static void printArray(int[][] arr){
     for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            
        }
    
}
