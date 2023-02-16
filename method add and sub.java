import java.util.Scanner;
class ex33 {
public void isAdd() {
  Scanner s=new Scanner(System.in);
    int a,b,sum;
    System.out.println("enter two number to find its sum:");
    
      a=s.nextInt();
     b=s.nextInt();
    sum=a+b;
     System.out.println("sum of two number is: "+sum);
  }
  public void isSub() {
  Scanner s=new Scanner(System.in);
    int a,b,sub;
    System.out.println("enter two number to find its sub:");
    
      a=s.nextInt();
     b=s.nextInt();
    sub=a-b;
     System.out.println("sum of two number is: "+sub);
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
ex33 obj = new ex33();
  
System.out.println("1. addition");
System.out.println("2. subraction");
System.out.println("Choose your option: ");
   int option=s.nextInt();
   if(option==1){
    obj.isAdd();
     }
    else if(option==2){
     obj.isSub();
      }
     else
    {
      System.out.println("invalid option: ");
    }
  
  }
}