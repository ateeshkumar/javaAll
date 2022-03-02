class gazi1 {
    public void printCount() {
       try {
          for(int i = 5; i > 0; i--) {
             System.out.println("Counter   ---   "  + i );
          }
       } catch (Exception e) {
          System.out.println("Thread  interrupted.");
       }
    }
 }
 
 class share extends Thread {
    private Thread t;
    private String threadName;
    gazi1  PD;
    share( String name,  gazi1 pd) {
       threadName = name;
       PD = pd;
    }
    
    public void run() {
       synchronized(PD) {
          PD.printCount();
       }
       System.out.println("Thread " +  threadName + " exiting.");
    }
 
    public void start () {
       System.out.println("Starting " +  threadName );
       if (t == null) {
          t = new Thread (this, threadName);
          t.start ();
       }
    }
 }
 
 public class TestThread {
 
    public static void main(String args[]) {
       gazi1 PD = new gazi1 ();
 
       share T1 = new share( "Thread - 1 ", PD );
       share T2 = new share( "Thread - 2 ", PD );
 
       T1.start();
       T2.start();
 
       // wait for threads to end
       try {
          T1.join();
          T2.join();
       } catch ( Exception e) {
          System.out.println("Interrupted");
       }
    }
 }
