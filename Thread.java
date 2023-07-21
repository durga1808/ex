public class Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println(" code is outside of the thread....");
  }
  public void run() {
    System.out.println("code is running in a thread....");
  }
}
