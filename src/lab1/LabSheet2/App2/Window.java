package lab1.LabSheet2.App2;

import javax.swing.*;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import javax.swing.JProgressBar;

public class Window extends JFrame implements Observer {

    ArrayList<JProgressBar> bars = new ArrayList<>();

    public Window(int nrThreads) {
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init(nrThreads);
        setVisible(true);
    }

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            JProgressBar pb = new JProgressBar();
            pb.setMaximum(1000);
            pb.setBounds(50, (i + 1) * 30, 350, 20);
            this.add(pb);
            this.bars.add(pb);
        }
    }

    public void setProgressValue(int id, int val) {
        bars.get(id).setValue(val);
    }

    @Override
    public void update(Observable o, Object arg) {

        bars.get(((Fir) o).id).setValue(((Fir) o).c);
    }
}