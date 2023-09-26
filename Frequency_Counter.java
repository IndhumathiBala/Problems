/*4. *Frequency Counter*:
    - *Problem*: Write a program that counts the frequency of each element in an array using a `java.util.HashMap`.
    - *Input*: `[3, 4, 3, 5, 4, 2]`
    - *Output*: `{2=1, 3=2, 4=2, 5=1}`
    - *Hint*: Use `HashMap<Integer, Integer>` where key is the array element and value is its frequency. 
  */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    int n=scanner.nextInt();
	    Map<Integer,Integer>map=new HashMap<>();
	    for(int i=0;i<n;i++)
	    {
	       int key=scanner.nextInt();
	       map.put(key,map.getOrDefault(key,0)+1);
	    }
	    for(Map.Entry<Integer,Integer>entry:map.entrySet())
	    {
	        System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	}
}
