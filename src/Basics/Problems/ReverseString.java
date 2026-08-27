package Basics.Problems;

public class ReverseString {
    public static void main(String[] args){
        /**
         * here we solve a proble  to like  how to reverse a string  
         */
        String name="deepak Shamra";
        //now we need  to print reverse version of  this string
        String reverseName="";
        for(int  i=name.length()-1;i>=0;i--){
            //here we start loop in decreasing order
            reverseName=reverseName+name.charAt(i);
        }
        System.out.println("with reverse value is : "+name);
        System.out.println("after reverse value is : "+reverseName);

        //so aboce we use a another string so in this case string are immutable so they  always create
        //antoerh  strign object so time compelity of this program is O(n2);

        //so  we have one antoehr method is string buildr where time complexity  become O(n)
        StringBuilder name2=new StringBuilder();
        for(int  i=name.length()-1;i>=0;i--){
            //here we start loop in decreasing order
            name2.append(name.charAt(i));
        }
        System.out.println(name2);
    }
}
