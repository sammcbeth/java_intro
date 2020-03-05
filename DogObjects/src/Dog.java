public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, weight, size);
        this.eyes = eyes;
        this.teeth = teeth;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog is chewing.");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("dog is walking.");
        move(2);
    }

    public void run(){
        System.out.println("Dog is running.");
        move(5);
    }


}