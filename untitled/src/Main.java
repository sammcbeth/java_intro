
public class Main {

    public static void main(String[] args) {

        int count = 1;
        do {
            System.out.println("Count value was " + count);

            count ++;
            if (count > 10000){
                break;
            }

        }while(count != 10.1);

        int number  = 4;
        int finishNumber = 20;
        int even_count = 0;
        while (number <= finishNumber){
            number ++;
            if(!isEvenNumber(number)){
                continue;
            }
            even_count ++;
            System.out.println("Even Number is " + number);
        }
        System.out.println(even_count);
    }
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
