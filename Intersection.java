
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    List<Integer>l1=new ArrayList<>();
	    List<Integer>l2=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    {
	        l1.add(sc.nextInt());
	    }
	    for(int i=0;i<m;i++)
	    {
	        l2.add(sc.nextInt());
	    }
	    l1.retainAll(l2);
	   // l2.retainAll(l1);
	    System.out.println(l1);
	}
}
