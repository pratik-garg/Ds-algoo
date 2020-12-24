package dsalgoQ;
import java.util.*;
public class Reverse_array {

	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		int s = arr.length;
		rev_rec(arr,0,s-1);
		print(arr,s);
	}
	
	//using iteration
	
	public static void rev_arr(int a[],int size) {
		int start = 0;
		int end = size-1;
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}
	
	//using recursion
	
	public static void rev_rec(int a[],int start,int end) {
		if(start>=end) {
			return;
		}
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		rev_rec(a,start+1,end-1);
	}
	
	//in python through slicing print(str[::-1])
	
	public static void print(int a[],int s) {
		for(int i=0;i<s;i++) {
			System.out.print(a[i] + " ");
		}
	}
}
