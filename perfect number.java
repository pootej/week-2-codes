class ex15 {
  public static void main(String args[]) {
    int sum=0,num,i;
       for(i=1;i<=100;i++)
      {
        num=1;
        while(num<=(i/2))
          {
            if(i%num==0)
            sum=sum+num;
            num++;
      }
        if(sum==i)
           System.out.println(" "+i);
        sum=0;
      }
      }
  }
