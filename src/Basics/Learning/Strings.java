package  Basics.Learning;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Strings{
    public static  void main(String[] args){

        /**
         * here  we learn about string in java
         * string is a non premetive data  typewehre we save   character  or sentence injava
         */

        //how to initlize strongand output  it
        // String name="Deepak";
        // System.out.println(name);
        
        //here how  to join two string and out put it
        String firstName="deepak";
        String lastName="sharma";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        //here we learn about how to print one  coorecter onetim e in  string
        for(int i=0;i<fullName.length();i++){
                System.out.println(fullName.charAt(i));
        }

        //now here  we learn   about how to compare  two  string a equeal or not 

        String password1="this";
        String password2="thiss";

        /**
         * so  comapre   string we have two  option first is == opreate and second is compareTo function
         * == may fail in some circentance so we always use copare to function and this  function return like  it
         * if first string > second string so return positiv number
         * if first  string == second string so its return  0
         * if first string  < second string so  its return  negativ number
         */
        if(password1.compareTo(password2)==0){
            System.out.println("password  match");
        }else{
            System.out.println("password  Does not match");

        }

        /*
        now we learn about substring also measn  when we  get some  part  of charactore from sentace so we use 
        substring wehere we give  begning  and  ending index  soo itr give center  of indexcharacter 
         */

        String sentence="My name is deepak sharma";
        //here we ne   to print  only deepak
        //also begining index must be given and its option to give  ending  index
        //String name1=sentence.substring(10); here  this print deepak sharma
        String name1=sentence.substring(10,17); //here  this print deepak
        System.out.println(name1);

    }
}