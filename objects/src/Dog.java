public class Dog extends animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int weight, String name, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, weight, name, size);
        this.eyes = eyes;
        this.teeth = teeth;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }
}
