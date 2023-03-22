package lab1.LabSheet2.App2;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    private final Model model;
    private final Window view;

    public Controller(Model model, Window view) {
        this.model = model;
        this.view = view;
        this.model.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        int id = (int) arg;
        int val = model.getProgressValue(id);
        view.setProgressValue(id, val);
    }
}