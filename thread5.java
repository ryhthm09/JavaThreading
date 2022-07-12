class ThreadC extends Thread{
  public void run()
  { //As sleep function throws InterruptedException we need to handle them so try catch block
  try{
      for(int i=0;i<=5;i++)
      {
       System.out.println(i);
       sleep(1000);//Stops the thread for some here 1000 is in millisecond
     }
   }
   catch(InterruptedException e)
    {
    e.printStackTrace();
    }
 }
 public static void main(String args[]){
 ThreadC t=new ThreadC();
 t.start();
 }
}
