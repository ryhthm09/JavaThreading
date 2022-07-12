
class ThreadG extends Thread{
  public void run(){
  try{
      for(int i=0;i<=5;i++)
      {
       System.out.println(i);
       sleep(1000);
     }
   }
   catch(InterruptedException e)//Interrupt method throws an exception and it gets caught here
    {
    e.printStackTrace();
    }
 }
 public static void main(String args[])throws InterruptedException
 {
  ThreadG t=new ThreadG();
   t.start();
   t.interrupt();
   //Interrupt method is used to interrupt a thread which is sleeping or waiting
   
  }
}