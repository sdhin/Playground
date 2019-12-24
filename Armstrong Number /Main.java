import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int count=0,n,temp1,temp2;
      double result=0;
      n=in.nextInt();
      temp1=n;
      temp2=n;
      while(temp1>0){
           count++;
           temp1/=10;
      }
      for(int i=0;i<=count;i++){
         int inner=n%10;
         double root=Math.pow(inner,count);
         result=result+root;
         n=n/10;
      }
      if(temp2==result)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}