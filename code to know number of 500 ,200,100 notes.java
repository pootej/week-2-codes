import java.util.Scanner;
class ex10 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int amount=0,a=0,b=0,c=0,d=0;
    System.out.println("enter the amount to withdrawl:");
    amount=s.nextInt();
    if(amount<100)
    {
       System.out.println("notes greater than 100:");
    }
     else 
    {
      if(amount%100==0)
      {
      a=amount/500;                                 //5300/500=10
      System.out.println("notes of 500 = " +a);     // 10
      amount=amount%500;                   //5300=5300%500=300 (new amount)                    
        
     if(amount>=200)                      //300>=200=100 
      b=amount/200; 
      System.out.println("notes of 200 = "+b);// b=300/200=1
      amount=amount%200;               //200=300%200=100(new amount)
      }
     if (amount >= 100)                
     {
      c=amount/100;
      amount=amount%100;
      System.out.println("notes of 100 = "+c);
     }
    }
   }
  }