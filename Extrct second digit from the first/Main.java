import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    //int value,count=2;
    while(n>99){
      n=n/10;
    }
    System.out.println(n%10);
  }
}