public class Bike extends Transport {
    public void addPassenger() {
        if (this.passengers < 2) {
            super.addPassenger();
        } else {
            System.out.println(this.name + " : not enough space for passenger !");
        }
    }

    public void addCargo(double cargo) {
        System.out.println(this.name + " : not enough space for cargo !");
    }
}
