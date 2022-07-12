class ThreadD extends Thread{
  public void run()
  { //As sleep function throws InterruptedException we need to handle them so try catch block
 
      for(int i=0;i<=5;i++)
      {
       System.out.println(i);
       Thread.yield();//Stops the current thread and give chance to other thread
     }
   //Yield does not throws any exception
   
 }
 public static void main(String args[]){
 ThreadD t=new ThreadD();
 t.start();
 System.out.println("Thread is stopped and will continue after main completes its execution");
 }
}
