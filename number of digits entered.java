 import java.util.Scanner;
class ex23 {
  public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
int count=0;
 System.out.println ("Enter number to find number of digits:");
 int num = s.nextInt();
    while(num!=0) {
 num=num/10;
 count=count+1;
 }
System.out.println("number of digits: " +count);
  }
}