import java.util.Scanner;
class ex18{
public static void main(String args[]){ 
Scanner s = new Scanner(System.in);
  int n=0,r=0,sum=0;
   System.out.println("enter the number to find its palindrome or not: ");
   n = s.nextInt();           //n=123  
 sum=n;
  while (n>0)       // 123>0 true //12>0 true // 1>0 true
{
r=n%10;               //123%10=3  //12%10=2 //1%10=1
  sum=(sum*10)+r;          //sum=sum+r(0=0*0+3) //3=3*10+2=32 // 32=32*10+1=321
  n= n/10;                 //123/10=12      // 12/10=1 // 1/10=0
}                        
  if(sum==n)
    System.out.print(" palindrome : ");
  else
    System.out.print(" not palindrome : ");
  }
  }


