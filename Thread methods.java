import java.io.*;
import java.lang.*;
class A extends Thread
{
       public void run()
        {
            for(int i=1;i<=3;i++)
           {
               if(i==1)
               { 
                    Thread.yield();
                    System.out.println("value of i="+i);
                }
            } 
            System.out.println("Exit from A");
         }
}
class B extends Thread
{
          public void run()
          {
          for(int j=1;j<=5;j++)
          {
              System.out.println("value of j="+j); 
              if(j==3)stop();
           }
System.out.println("Exit from B");
}
}
class C extends Thread
{
             public void run()
             {
              for(int k=1;k<=5;k++)
             {
                System.out.println("value of k="+k);
                if(k==1)
                try
                {
                    sleep(1000);
                }
                catch(Exception e)
                {

                }
             }
System.out.println("Exit from C");
}
}

public class Thread methods
{
       public static void main(String[]args)throws IOException
       {
            A thA=new (A);
            B thB=new (B);
            C thC=new (C);
            thA.start();
            thB.start();
            thC.start();
            System.out.println("Exit from main");
       }
}