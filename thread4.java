//This is tutorial about Some thread functions

import java.lang.*;
class ThreadB extends Thread{
  public void run(){
  System.out.println("Thread is running");
  System.out.println(Thread.currentThread().getName());//Method to get Current Thread Name
  Thread.currentThread().setName("Anand");//Changing thread name
  System.out.println(Thread.currentThread().getName());
 }

  public static void main(String []args){
  System.out.println("We are in the main method");
  ThreadB t=new ThreadB();
  t.start();
  System.out.println(Thread.currentThread().getName());
  System.out.println("Main is also a thread run by JVM");
  Thread.currentThread().setName("Ryhthm");//Changing name of main thread
  System.out.println(Thread.currentThread().getName());
  //You may get the output in any sequence as thread run simultaneously

 }
}
 

 