import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int sum=0;
      int n=in.nextInt();
      for(int i=1;i<=n;i++){
          sum+=i;
      }
      System.out.println(sum);
	}
}