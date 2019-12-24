import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
        if(i==1||i==n){
        for(int j=0;j<n;j++){
          System.out.print("*");
        }
        }
        else{
          for(int x=1;x<=n;x++){
          if(x==1||x==n){
          System.out.print("*");}
          else{
          System.out.print(" ");}}
      }
        System.out.print("\n");}
	}
}