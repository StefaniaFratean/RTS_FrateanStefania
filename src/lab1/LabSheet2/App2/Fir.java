package lab1.LabSheet2.App2;

import java.util.Observable;

public class Fir extends Observable implements Runnable {

    int id;
    int c;
    int processorLoad;
    Thread t;

    Fir(int id, int priority, int procLoad) {
        this.id = id;
        this.processorLoad = procLoad;
        this.t = new Thread(this);
        this.t.setPriority(priority);
    }

    public void run() {
        c = 0;
        while (c < 1000) {
            for (int j = 0; j < this.processorLoad; j++) {
                j++;
                j--;
            }
            c++;
            //this.model.setProgressValue(id, c);
            setChanged();
            notifyObservers();
        }
    }
}

