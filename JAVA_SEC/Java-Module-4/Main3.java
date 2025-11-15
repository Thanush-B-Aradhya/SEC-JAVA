class Transport {
    void move() {
        System.out.println("Transport is moving...");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers.");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck is carrying goods.");
    }
}

public class Main3 {
    public static void main(String[] args) {

        // Creating Bus object
        Bus b = new Bus();
        b.move();               // inherited from Transport
        b.carryPassengers();    // Bus-specific method

        System.out.println();

        // Creating Truck object
        Truck t = new Truck();
        t.move();              // inherited from Transport
        t.carryGoods();        // Truck-specific method
    }
}
