//To create a thread there are two ways in JAVA
//1.Using Runnable interface
//2.Inheriting Thread Class.
class MyThread implements Runnable
{
  public void run()
  {
  System.out.println(" The thread is running");
  }
  public static void main(String []args){
   MyThread t1=new MyThread();
   Thread th=new Thread(t1);//Creating a thread and object of current class is passed.
   th.start();
  }
}



