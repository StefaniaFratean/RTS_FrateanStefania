package lab3.LabSheet4.App1;

public class FirstThread extends Thread{
    Integer monitor;
    int activityMin;
    int activityMax;
    int transition;

    public FirstThread(Integer monitor, int activityMin, int activityMax, int transition) {
        this.monitor = monitor;
        this.activityMin = activityMin;
        this.activityMax = activityMax;
        this.transition = transition;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " - STATE P1");
        synchronized (monitor)
        {
            System.out.println(this.getName() + " - STATE P4");
            try{
                Thread.sleep(Math.round(Math.random() * (activityMax-activityMin) + activityMin) * 500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        try{
            Thread.sleep(transition * 500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " - STATE P6");

    }
}
