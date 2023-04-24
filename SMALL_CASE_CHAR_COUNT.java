Question
Write main method in Solution class.
In the main method, read a String value and print the count of lower case characters
present in the input String value. If no lower case characters are present in the String value
then it should print "No lower case characters present" as a String.


Sample input1:
XpLore
Output:
4


Sample input2:
XPLORE
Output:
No lower case characters present

--------------------------------------------------


import java.util.Scanner;
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                count+=1;
            }
        }
        if(count>0)
            System.out.println(count);
        else
            System.out.println("No lower case characters present");
    }
}
