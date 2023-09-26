
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int capacity=sc.nextInt();
	    Map<Integer,String>map=new LinkedHashMap<>(){
	        protected boolean removeEldestEntry(Map.Entry<Integer,String>eldest)
	        {
	            return size()>capacity;
	        }
	   };
	   for(int i=0;i<n;i++)
	   {
	       int key=sc.nextInt();
	       String value=sc.next();
	       map.put(key,value);
	       System.out.println("Map has entries:-");
	       for(Map.Entry<Integer,String>entry:map.entrySet())
	       {
	           System.out.println(entry.getKey()+" "+entry.getValue());
	       }
	   }
	}
}
