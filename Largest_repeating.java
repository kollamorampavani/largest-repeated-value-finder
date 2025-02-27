package arrays;
import java.util.*;
public class Largest_repeating {
	public static int lar_repeating(int[] a) {
		for(int i=a.length-1;i>=1;i--) {
			if(a[i]==a[i-1]) {
				return a[i];
			}
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int[] a=new int[n];
     for(int i=0;i<a.length;i++) {
    	 a[i]=scan.nextInt();
     }
     int res=lar_repeating(a);
     System.out.print(res);
     
	}

}
