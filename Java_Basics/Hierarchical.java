class Bike1 {
    int speed;
    int gear;

    public Bike1(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void getSpeed() {
        System.out.println("The speed is " + speed);
    }

    public void getGear() {
        System.out.println("The gear is " + gear);
    }
}

class Boxer extends Bike1 {

    public Boxer(int gear, int speed) {
        super(gear, speed);
    }

    public void showBoxerFeatures() {
        System.out.println("Boxer bike");
    }
}

class Pulsar extends Bike1 {

    public Pulsar(int gear, int speed) {
        super(gear, speed);
    }

    public void showPulsarFeatures() {
        System.out.println("Pulsar bike ");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Bike1 bike = new Bike1(4, 80);
        bike.getGear();
        bike.getSpeed();

        Boxer boxer = new Boxer(3, 50);
        boxer.getGear();
        boxer.getSpeed();
        boxer.showBoxerFeatures();

        Pulsar pulsar = new Pulsar(5, 120);
        pulsar.getGear();
        pulsar.getSpeed();
        pulsar.showPulsarFeatures();
    }
}
