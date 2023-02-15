import java.util.Scanner;

class ex25 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
     int n,d,f=1;
      System.out.println("enter the number to check strong or not :");
     n=s.nextInt();
    int num=n;
    int sum=0;
    while(n>0)
      {
        d=n%10;                     // d=145%10=5//d=14%10=4
        for(int i=0;i<=d;i++)        
          {
            f=f*i;               //factorial 
          }
        sum=sum+f;                //0=0+1=1
        n=n/10;                    //145/10=14
      }
    if(num==sum)  ///
    {
      System.out.println("strong :");
    }
    else
    {
        System.out.println(" not :");
    }
  }
}