/**7. Circular Array Rotation*:

- *Problem*: Given an array, rotate it to the right by `k` steps, where `k` is a non-negative number. For instance, after rotating the array `[1,2,3,4,5]` by 2 steps, the output should be `[4,5,1,2,3]`.

- *Hint*: Consider using the `Collections.rotate` method or manually implementing the rotation.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    List<Integer>arr=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    {
	        arr.add(sc.nextInt());
	    }
	    int k=sc.nextInt();
	    Collections.rotate(arr,k);
	    for(int i:arr)
	    {
	        System.out.print(i+" ");
	    }
	}
}
