//2.Using Thread Class

class Thread2 extends Thread
{
  public void run(){
   System.out.println("Thread is running");
  }
  
  public static void main(String args[]){
  Thread2 t2=new Thread2();
  //While using Thread class we dont need to create an additional Thread like we did in thread1
  t2.start();//method overriding of Thread Class
  }
}
 