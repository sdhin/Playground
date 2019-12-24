import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner n=new Scanner(System.in);
      int num=n.nextInt();
      
      for(int j=2;j<=(num);j++){
      prime(j);
      }
	}
  public static void prime(int s){
    int i,m=0,flag=1;
    
    for(i=2;i<s;i++){
      if(s%i==0){
        flag=0;}
     
    }
     if(flag==1)
        System.out.println(s);
    
}
}