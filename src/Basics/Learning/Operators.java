package Basics.Learning;

public class Operators {
    public static void main(String[] args){

        /**
         * here we learn about opreator  in java
         * so we devide opreatore in some category in java 
         */

        /**
         * 1. Arthmetic opreator 
         * here we use some mathemticatal opreator to perform some task here we need to 
         * 2 opreant to  performt this alsoarthemetic  op also devide in 2  sub categoory 
         * 1. binary (+,-,*,/,%)
         * 2. unary(++,--)
         */

        //here we perform arthemtic opreator
        int a=10;
        int b=20;
        int c=a+b;//here we add plus  two number  and  save   into  c
         c=a-b;//here we minus  two number  and  save   into  c
         c=a*b;//here we multyply  two number  and  save   into  c
         c=a/b;//here we devide  two number  and  save   into  c
         c=a%b;//here we find remainder of    two number  and  save   into  c measn which value we get after devide remaind we get in modular opreator
         
         //unary opreator
         c++;//post increment op here always value increase by 1 (post measn first increase value   than use)
         c--;//post decreament op here always value decrease by 1
         ++c;//pre increment op here always value increase by 1 (pre  means first use value than increase)
         --c;//post decreament op here always value decrease by 1



         /**
          * 2. is realational opreator
          * when we perform some relation between  twoo  opreant we use realtion  opreator 
          * like ==(compare),!=(not equeal to ),>(greater than),< (less than), >=(grathan  than  equeal to ),<=(less tha  queal to )
          */

         //example like
         if(a==b){
                //here we check  a value is equal to b  like 10==20 if its equal than  its return true otherwise false
         }
         if(a!=b){
                //here we check  a value is not equal to b  like 10!=20 if its not equal than  its return true otherwise false
         
         }
         if(a>b){
                //here we check  a value is greater than  b  like 10>20 if its greater than  b its return true otherwise false
         
         }
         if(a<b){
                //here we check  a value is less than  b  like 10<20 if its less than  b its return true otherwise false
         
         }


         if(a>=b){
                //here we check  a value is greater than or equal to    b  like 10>=20 if its greater  than or  equeal to   b its return true otherwise false
         
         }
         if(a<=b){
                //here we check  a value is less than or equal to    b  like 10<=20 if its less  than or  equeal to   b its return true otherwise false
         
         }


         /**
          * logical opreator 
          * when we  need to compare  two  statement so we use logical opreator this only 3 like
          * && (logical and )
          * || (logical or)
          * ! (logical not)
          */
         if(a>b && b>c){
            //here we check a> b and b>c here if both conditon are true than in this case our if work other not work
         }

         if(a>b && b>c){
            //here we check a> b and b>c here we use or opreatore so in this case  if any one condtion  are true than is return true and out if work
            
        }
        if(!(a>b)){
             //here we check a> b and b>c here we use not opreator so is always  return of oppison of conditon  liek if our statement reutnr true but if use not op so  its become false   

         }


         /**
          * 4.bitwise opreator 
          * so in java all value  are store in bit in tthe form  of 0 and 1 so we have also have bitwise  opreatore to perform  opreation on   binary
          * they opreatore are like &(binary and), | (binary or), ^ (Binary xor) , ~ (binary one complement), << (binary left shift), >> (binary right shift)
          */

         //binary AND (&)
         /**
          * here  if both binary are one than itr become one othersise its become 0 like 
          * 101
          * 011
          * result is 
          * 001
          */


         //binary OR (|) 
         /**
          * here  if any one binary vvalue is one than is becoe 1  like 
          * 101
          * 011
          * result is 
          * 111
          */

         //binary XOR (^) 
         /**
          * in  this  case  if  both  value  are same so its reutnr 0 and both value are diffrent  so its reutnr 1 
          * 1010
          * 0110
          * result is 
          * 1100
          */

         
         //binary one complement (~) 
         /**
          * they always use in  single binary liek 01010 or  in this case they  reverse of this binary means 
          * chaneg 1 into 0 and 0 into 1 
          * 1010
          * result is 
          * 0101
          */


          //binary left shift (<<) 
         /**
          * in this we move binary to left shift and new valeu which  are coming from left shift become 0 like 
          * 1010  after left shift  its become
          * result is 
          * 0100
          */
         
          //binary right shift (>>) 
         /**
          * in this we move binary to right shift and new valeu which  are coming from rightt shift become 0 like 
          * 1010  after right shift  its become
          * result is 
          * 0101
          */



         /**
          * 5. is assigment opreator
          * this use to assogn value into variale and  e have 5 assignment opreator like
          * = ,+=,-+=,*=,/=
          */
         a=10;//here we assign 10 value  in  a where alwayd left side value  assign in rightt side
         b+=10;//  this  is some diffrect simple meansing  is b=b+10; means first we add 10 into  b and after again assign  b value in b 
         b-=10;//  this  is some diffrect simple meansing  is b=b-10; means first we dedcut 10 into  b and after again assign  b value in b 
         b*=10;//  this  is some diffrect simple meansing  is b=b*10; means first we multyple 10 into  b and after again assign  b value in b 
         b/=10;//  this  is some diffrect simple meansing  is b=b/10; means first we devide 10 into  b and after again assign  b value in b 




        
    }
}
