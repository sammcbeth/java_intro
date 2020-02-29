public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberasString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);

        numberAsString += 1;
        number += 1;
        System.out.println("number as tsring = "+ numberAsString);
        System.out.println("number = "+ number);
    }
}
