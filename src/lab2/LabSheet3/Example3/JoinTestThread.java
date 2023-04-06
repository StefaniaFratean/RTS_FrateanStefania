package lab2.LabSheet3.Example3;

class JoinTestThread extends Thread{

    Thread t;
    static int sum;
    JoinTestThread(String n, Thread t){
        this.setName(n);
        this.t=t;
    }

    public void run() {
        System.out.println("Thread "+t.getName()+" has entered the run() method");
        try {
            if (t != null) t.join();
            System.out.println("Thread "+t.getName()+" executing operation.");
            Thread.sleep(3000);

            System.out.println("Thread "+t.getName()+" has terminated operation.");
        }
        catch(Exception e){e.printStackTrace();}

    }

}