package lab1.LabSheet2.App2;

public class Fir extends Thread {

    int id;
    Model model;
    int processorLoad;

    Fir(int id, int priority, Model model, int procLoad) {
        this.id = id;
        this.model = model;
        this.processorLoad = procLoad;
        this.setPriority(priority);
    }

    public void run() {
        int c = 0;
        while (c < 1000) {
            for (int j = 0; j < this.processorLoad; j++) {
                j++;
                j--;
            }
            c++;
            this.model.setProgressValue(id, c);
        }
    }
}

