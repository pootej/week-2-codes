import java.util.Scanner;
class ex17{
public static void main(String args[]){ 
Scanner s = new Scanner(System.in);
   int i,n,t=1;
  System.out.println("enter the number to find its factorial: ");
  n = s.nextInt();  
  for(i=1;i<=n;i++)
    {
      t=t*i;
    }
    System.out.println("factorial of tat number is: "+t);
}
}