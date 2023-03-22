package lab1.LabSheet2.App2;

public class Main {

    private static final int noOfThreads = 6;
    private static final int processorLoad = 1000000;

    public static void main(String[] args) {

        Model model = new Model();
        Window view = new Window(noOfThreads);
        Controller controller = new Controller(model, view);

        for (int i = 0; i < noOfThreads; i++) {
            new Fir(i, i + 2, model, processorLoad).start();
        }
    }
}
