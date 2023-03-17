package com.personal.practice;

public class MakePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aba";
	    String s2 = "malay";
	    System.out.println(makePalindrome(s1)); // prints "madam"
	    System.out.println(makePalindrome(s2)); // prints "malayalam"
	}
	
	public static String makePalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(s.equals(sb.reverse().toString())){
            return s;
        }else{
            StringBuilder s_pending=new StringBuilder();
            int i=0;
            int j=s.length()-1;
            while(i <= j){
                if(s.charAt(i) != s.charAt(j)){
                    s_pending.append(s.charAt(i));
                    i++;
                }else{
                    i++;
                    j--;
                    continue;
                }
                
            }
            s = s+s_pending.reverse().toString();
           
            return s;
        }
    }

}
