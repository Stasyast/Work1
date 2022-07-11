public class Transport {
    String name = "transport";
    double cargo = 0;
    int passengers = 0;
    boolean inMove = false;

    public void beep()
    {
        System.out.println(this.name + " : beep");
    }

    public void start()
    {
        this.inMove = true;
        System.out.println(this.name + " : start move");
    }
    public void stop()
    {
        this.inMove = false;
        System.out.println(this.name + " : stop");
    }
    public void status()
    {
        if (this.inMove) {
            System.out.println(this.name + " : status 'moving'");
        } else {
            System.out.println(this.name + " : status 'waiting'");
        }
        System.out.println(this.name + " : cargo " + this.cargo + ", passengers " + this.passengers);
    }
    public void addPassenger()
    {
        System.out.println(this.name + " : add passenger ");
        this.passengers ++;
    }
    public void addCargo(double cargo)
    {
        System.out.println(this.name + " : add cargo " + cargo);
        this.cargo = this.cargo + cargo;
    }

}