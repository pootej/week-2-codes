import java.util.Scanner;

class ex27 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n;
    int r,sum=0;
    System.out.println("enter the number to check strong or not :");
     n=s.nextInt();
      int temp=n;      
    while(n>0)
      {
        r=n%10;          //r=153%10=3
        n=n/10;          //153/10=15
        sum=sum+r*r*r;    //sum=sum+3*3*3
      }
    if(temp==sum)        //temp==sum==n
      System.out.println("strong  :");  
    else
        System.out.println(" not :");
      
  }
}
    