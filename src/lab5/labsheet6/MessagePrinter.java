package lab5.labsheet6;

public class MessagePrinter extends Thread{
    P display;
    Supervisor supervisor;
    public void run() {
        int prev;
        prev = 0;
        while (true) {
            try {
                // display.acquire();
                // the if statement is too slow to detect all the moves
                // if (prev != supervisor.ps_o2.x)
                //
                try {
                    Thread.sleep(3000); // print position every 3 seconds
                } catch (Exception e) {}
                System.out.println("arrived at: " + supervisor.ps_o2.x);
                // prev = display.x;
                prev = supervisor.ps_o2.x;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
