class ThreadI extends Thread{

 public void run(){
   System.out.println(Thread.currentThread().isInterrupted() +" HI");
 try{
     for(int i=0;i<5;i++)
      {
         System.out.println(i);
         sleep(1000); 
         //The below line is redundant as control will flow to catch block
         System.out.println(Thread.currentThread().isInterrupted() +"Hello"); 
      }
   }
  catch(InterruptedException e)
  {
    e.printStackTrace();
  }
}
 public static void main(String args[])
 {
  ThreadI t=new ThreadI();
  t.start();
  t.interrupt();
 
 }
}