package lab1.LabSheet2.App2;

public class Main {

    private static final int noOfThreads = 6;
    private static final int processorLoad = 1000000;

    public static void main(String[] args) {

        Fir fir;
        Window view = new Window(noOfThreads);
        //Controller controller = new Controller(fir, view);

        for (int i = 0; i < noOfThreads; i++) {
            fir = new Fir(i, i + 2, processorLoad);
            fir.addObserver(view);
            fir.t.start();
        }
    }
}
