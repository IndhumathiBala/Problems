/**5. Anagram Checker*:
   
- *Problem*: Write a Java program to check whether two given strings are anagrams of each other. Two strings are anagrams if they contain the same characters in any order. The comparison should be case-insensitive and should ignore spaces.
   
- *Input*: 
    - String 1: "Listen"
    - String 2: "Silent"
    
- *Output*: `true`

- *Hint*: Use the `java.util.Arrays` class to sort the characters of the strings and then compare. Alternatively, you could use a `java.util.HashMap` to count character occurrences in each string and then compare the counts. 
  */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String s1=scanner.nextLine();
	    String s2=scanner.nextLine();
	    int []hash=new int[26];
	    for(char ch:s1.toCharArray())
	    {
	        ch=Character.toLowerCase(ch);
	        hash[ch-'a']++;
	    }
	    for(char ch:s2.toCharArray())
	    {
	        ch=Character.toLowerCase(ch);
	        hash[ch-'a']--;
	    }
	    for(int i=0;i<26;i++)
	    {
	        if(hash[i]!=0)
	        {
	            System.out.println("false");
	            return ;
	        }
	    }
	    System.out.println("True");
	}
}
