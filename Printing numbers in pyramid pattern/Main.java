import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=0,count=1;
      for(int i=1;i<=n;i++){
        for(int x=1;x<=(n-i);x++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print(count+" ");
          count++;
        }
        System.out.print("\n");
      }
    }    
}