package Basics.Learning;

public class BitManupulation {
    public static void main(String[] args){
        /**
         * here we learn about bit manupulation in java
         * 
         * we have some task to which we perform on  bit he name like
         * get here we get to find bit is 0  or 1
         * set bit  here we set 0 bit to 1 
         * clear bit here we set bit to 0
         * update bit here we  padte bit like 0 to 1 and 1 to 0
         */

        /**
        * 1st opreation get bit
        * first we move 1>> by n position which bit we need to get  after we get bit and after we now use and op to original bit to get bit positon  number
         */

        // int n=5;//in bit he look (0101)
        // int pos=3;
        // int  bitMask=1<<pos;//here our bit mask look like(1000)
        // if((bitMask & n) == 0){
        //     System.out.println("bit was zero");
        // }else{
        //     System.out.println("bit was one");

        // }

        /**
         * 2st op is set bit
         * first we make bit mask  than we perform  or opreator
         * here  we have 5 like 0101 than  we update 2 bit to 1 after her become 7
         */
        // int n=5;//in bit he look (0101)
        // int pos=1;
        // int  bitMask=1<<pos;//here our bit mask look like(0001)
        // int finalAns=(bitMask | n);
        // System.out.println(finalAns);

        /**
         * 3st op is clear bit
         * first we make bit mask  than we perform  And Not opreator
         * so to perform  not we use ~ op first we get not  of bitmask than we perform  and
         * here  we have 5 like 0101 than  we clear 3 bit to 0 after her become 1
        //  */
        // int n=5;//in bit he look (0101)
        // int pos=2;
        // int  bitMask=1<<pos;//here our bit mask look like(0100)
        // int andBitmask=~bitMask;
        // int finalAns=(andBitmask & n);
        // System.out.println(finalAns);
 
        
        /**
         * 4st op is update bit
         * first we make bit mask  than we have   2 path to perform  
         * if we need to  update value form 1 to 0 than we make not of bitmask than  we perform and op  same like (clear)and  if need to  make 0 into  1 than we perform  or  opreator same like set op
         * here  we have 5 like 0101 than  we clear 3 bit to 0 after her become 1
         */

        int n=5;//in bit he look (0101)
        int pos=1;
        int op=1;//1 update  1 and 0 if needto update 0 to 1 thanenter 1 adn we need 1 to  0 thanenter 0

        //for set opreation logic  same  to update  0 to  1
        if(op==0){
        int  bitMask=1<<pos;//here our bit mask look like(0100)
        int finaiBitmask=~bitMask;
        int finalAns=(finaiBitmask & n);
        System.out.println(finalAns);
        }else{
        int  bitMask=1<<pos;//here our bit mask look like(0100)
        // int finaiBitmask=~bitMask;
        int finalAns=(bitMask | n);
        System.out.println(finalAns);
        }



        




    }
}
