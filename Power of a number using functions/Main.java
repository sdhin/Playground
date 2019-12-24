import java.util.*;
class Main{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int base=s.nextInt();
int exp=s.nextInt();
pow(base,exp);}
public static void pow(int b, int e){
int sum=1;
  for(int i=1;i<=e;i++){
  sum*=b;}
  System.out.println(sum);
}}