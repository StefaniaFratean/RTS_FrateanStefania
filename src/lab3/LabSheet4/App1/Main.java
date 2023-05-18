package lab3.LabSheet4.App1;

public class Main {
    public static void main(String[] args) {
        Integer monitor1 = 1;
        Integer monitor2 = 1;

        new FirstThread(monitor1, 2,4,4).start();
        new FirstThread(monitor2, 2,5,5).start();
        new SecondThread(monitor1,monitor2, 3,3,6).start();
    }
}
