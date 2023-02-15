import java.util.Scanner;
class ex22 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num,i=1,count=0;
      System.out.println("enter the number to find numbr of factors:");
     num=s.nextInt();
    while(i<=num/2)            // 1<=10/2(1<=5) // 2<=10/2(2<=5)//3=10/2)(3<=5)
      {
        if(num%i==0)          //10%1==0 // 10%2==0 // 10%3=!1
        {
          count=count+1;      //0=0+1=1  //1==1+1=2//
           
        }
       i=i+1;                //1=1+1=2 // 2=2+1 //
      }
    System.out.println("The number of factors is" +count);
  }
}