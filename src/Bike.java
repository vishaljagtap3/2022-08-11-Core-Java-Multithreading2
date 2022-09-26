public class Bike extends Vehicle implements Runnable {

    private int speed;
    private String model;

    public Bike(String passingNo, int speed, String model) {
        super(passingNo);
        this.speed = speed;
        this.model = model;
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setName(model + " Thread");
        thread.start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(400 - speed);
            }
            catch (InterruptedException ie){}
            System.out.println(model);
        }
        System.out.println(model + " Finished");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
