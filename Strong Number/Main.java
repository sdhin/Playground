import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int t1=n;
      int mul,sum=0;
      while(n>0){
        int temp=n%10;
        mul=1;
        for(int i=1;i<=temp;i++){
            mul=mul*i; 
        }
        sum+=mul;
        n=n/10;
      }
      if(t1==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}