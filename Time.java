public class Time extends Thread {
    private static int tick = 0;
    public Time(){

    }
    public static int getTick(){
        return tick;
    }
    public void read(){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    public void read(int milli){
      try {
        Thread.sleep(milli);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    public void run(){
        tick++;
        try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        if (tick == 24){
          tick = 0;
        }
        run();
    }
    public void clear(){
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
    }
    public void clear(int i){
      System.out.print(String.format("\033[%dA", i));
      System.out.print("\033[2K");
    }
}
