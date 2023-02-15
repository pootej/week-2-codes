import java.util.Scanner;
class ex11{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Double unit,bill;
    System.out.println("enter  units:");
       unit=s.nextDouble();
      if(unit<=50)
      {
      bill=unit*0.50;
      }
    else if (unit<=150)
    {
    bill=(50*0.50)+(unit-50)*1.23;
    }
     else if(unit<=250)
     {
      bill=(50*0.50)+(100*1.23)+(unit-150)*1.90;
    }
    else
     {
      bill=(50*0.50)+(100*1.23)+(100*1.90)+(unit-250)*2.34;
    }
    System.out.println("the bill is"+bill);
  }
}
    