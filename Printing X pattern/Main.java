import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     // int k=n*2-1;
      for(int i=0;i<n;i++){
        int len=n-1-i;
      for(int j=0;j<n;j++){
      if(j==i||j==len)
      System.out.print("*");
      else
      System.out.print(" ");}
      System.out.print("\n");}
	}
}