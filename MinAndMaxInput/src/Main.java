import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 9999999;
        int max = 0;

        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Enter a number");
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                if (number < min){
                    min = number;
                }
                if(number > max){
                    max = number;
                }
            } else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        scanner.close();
    }
}
