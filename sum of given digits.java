import java.util.Scanner;
class ex32 {
 public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
   System.out.println("Enter number to find sum of digits:");
      int num=s.nextInt();
   int sum=0;
   while(num!=0){
     sum=sum+num%10;
     num=num/10;
   }
   System.out.println("sum of digits:"+sum);
   }
}