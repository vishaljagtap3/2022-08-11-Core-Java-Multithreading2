public class Car extends Vehicle implements Runnable {

    private String model;
    private int speed;
    private boolean flag = true;

    public Car(String passingNo, String model, int speed) {
        super(passingNo);
        this.model = model;
        this.speed = speed;
    }

    public void stop() {
        flag = false;
    }

    @Override
    public void run() {
        move();
    }

    public void move() {
        //while(flag) {
        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(400 - speed);
            }
            catch (InterruptedException ie){}
            System.out.println(model);
        }
        System.out.println(model + " Finished");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
