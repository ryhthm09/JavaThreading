class ThreadE extends Thread{
  public void run()
  { 
  
       System.out.println(Thread.currentThread().getName()+ " is running");

  }
}
class ThreadF extends Thread{
  static ThreadE t1=null;
  public void run(){
  try{
     t1.join();//By calling t1.join thread will wait until t1 finishes
    System.out.println(Thread.currentThread().getName()+ " is running");
   }
    catch(InterruptedException e)
   {
    e.printStackTrace();
    } 
}
  public static void main(String args[])throws InterruptedException
  {
 
     t1=new ThreadE();
   
   ThreadF t2=new ThreadF();
   t2.start();
   t1.start();
   
    t2.join();//By calling join the main thread will wait until t2 runs and finishes
    System.out.println(Thread.currentThread().getName()+ " is running");
   
  }
}
