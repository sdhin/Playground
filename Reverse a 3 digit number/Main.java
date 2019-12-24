import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int first,second,third,result;
    first=(n/100);
    second=((n/10)%10);
    third=(n%10);
    result=(third*100)+(second*10)+first;
    System.out.println(result);
  }
}