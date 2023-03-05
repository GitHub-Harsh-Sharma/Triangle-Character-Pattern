import java.util.*;
class Chardataasciifor66
{
  public static void main(String[] args) 
  {
   int i,s,a=2,k,b=65;
   for(i=1;i<=3;i++)
   {
       for(s=1;s<=a;s++)
       {
           System.out.print(" ");
       }
       for(k=65;k<=b;k++)
       {
           System.out.print((char)k);
       }
       System.out.println("");
       a=a-1;
       b=b+2;
   }   
  }
}
