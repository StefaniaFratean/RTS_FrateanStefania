package lab3.LabSheet4.App1;

public class SecondThread extends Thread{
    Integer monitor1;
    Integer monitor2;
    int activityMin;
    int activityMax;
    int transition;

    public SecondThread(Integer monitor1, Integer monitor2, int activityMin, int activityMax, int transition) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
        this.activityMin = activityMin;
        this.activityMax = activityMax;
        this.transition = transition;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " - STATE P11");
        synchronized (monitor1)
        {
            synchronized (monitor2)
            {
                System.out.println(this.getName() + " - STATE P12");
                try{
                    Thread.sleep(Math.round((Math.random() * (activityMax-activityMin)+activityMin)*500));
                }
                catch (InterruptedException e) { e.printStackTrace(); }
                try{
                    Thread.sleep(transition * 500);
                }
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
        System.out.println(this.getName() + " - STATE P13");
    }
}
