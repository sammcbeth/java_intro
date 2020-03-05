public class Animal {
    private int brain;
    private int body;
    private int weight;
    private String name;
    private int size;

    public Animal(String name, int brain, int body, int weight, int size) {
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.name = name;
        this.size = size;
    }

    public void eat(){
        System.out.println("Animal is eating.");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " + speed);
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}