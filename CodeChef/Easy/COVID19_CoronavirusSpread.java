import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in );
		int t= sc.nextInt();
		while(t-->0){
		    int n= sc.nextInt();
		    int x[]= new int [n];
		    for(int i=0; i<n;i++){
		        x[i]=sc.nextInt();
		    }
		    int min=Integer.MAX_VALUE, max=-1;
		    for(int i=0;i<n;i++){
		        int left=i, right=i;
		        boolean flag1=true, flag2= true;
		        int sum=1;
		        while(flag1||flag2){
		            if(left<=0){
		                flag1=false;
		            }
		            if(right>=n-1){
		                flag2=false;
		            }
		            if(flag1){
		            if(Math.abs(x[left]-x[left-1])<=2){
		                sum++;
		                left--;
		            }
		            else{
		                flag1=false;
		            }
		            }
		            if(flag2){
		                if(Math.abs(x[right]-x[right+1])<=2){
		                sum++;
		                right++;
		            }
		            else{
		                flag2=false;
		            }
		                
		            }
		        }
		        min=Math.min(min,sum);
		        max= Math.max(max, sum);
		    }
		    System.out.println(min+" "+max);
		}

	}
}