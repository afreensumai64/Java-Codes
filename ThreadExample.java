class MyThread extends Thread {
  public void run () {
      try {
        System.out.println("Thread is starting");
        Thread.sleep(2000);
        System.out.println("Thread is running again...");
      } catch (InterruptedException e) {
        System.out.println("Thread is interrupted");
      }
  }

}


 public class ThreadExample {
    public static void main(String[] args) {
          MyThread t = new MyThread();
          t.start();
          }
    }


