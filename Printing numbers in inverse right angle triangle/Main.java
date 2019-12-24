import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      for(int i=1;i<=temp;i++){
        for(int j=n;j>=1;j--){
          System.out.print(j);

        }
                  n--;
        System.out.print("\n");
      }
	}
}