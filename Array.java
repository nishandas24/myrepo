package myrepo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Array {
    public static void main(String[] args)
    {
           String s1="nishan"; 
           int count=0; 
           Set<Character> set=new LinkedHashSet<Character>(); 
           for(int i=0;i<s1.length();i++) 
           { char ch=s1.charAt(i); 
            if(ch>='a' && ch<='z') 
            { 
                set.add(ch); 
            } 
        }
		  System.out.println(set); 
          System.out.println(set.size());
    }
}
