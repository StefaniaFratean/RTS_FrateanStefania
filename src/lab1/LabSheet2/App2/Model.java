package lab1.LabSheet2.App2;

import java.util.Observable;

public class Model extends Observable {

    private final int[] progressValues;

    public Model() {
        this.progressValues = new int[6];
    }

    public void setProgressValue(int id, int val) {
        this.progressValues[id] = val;
        setChanged();
        notifyObservers(id);
    }

    public int getProgressValue(int id) {
        return progressValues[id];
    }
}