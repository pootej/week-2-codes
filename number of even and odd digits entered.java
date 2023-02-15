import java.util.Scanner;
class ex24 {
  public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
int num, ecount=0,ocount=0;
System.out.println ("Enter number to find no.of even digits and no.of odd digits:");
  num = s.nextInt();
    while(num!=0)
 {
 
      if(num%10)%2==0){     //(4567%10)%2==0  // false
        ecount++;
      }
   else{
     ocount++;                     //count +1/
   }
     num=num/10;
 }
System.out.println ("number of even digits "+ecount);
System.out.println ("number of odd digits"+ocount);
  }
}