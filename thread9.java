class ThreadH extends Thread{

 public void run(){
   System.out.println(Thread.interrupted());
 try{
     for(int i=0;i<5;i++)
      {
         System.out.println(i);
         sleep(1000);
         System.out.println(Thread.interrupted()); 
      }
   }
  catch(InterruptedException e)
  {
    e.printStackTrace();
  }
}
 public static void main(String args[])
 {
  ThreadH t=new ThreadH();
  t.start();
  t.interrupt();
  //Dont be shocked at the output interrupted method returns if the thread was interrupted or not and then changes its value to false as well
 }
}