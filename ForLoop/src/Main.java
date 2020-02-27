public class Main {

    public static void main(String[] args) {

        for(double i = 0.0; i < 5; i += .25){
//            double rate = i /4;
//            System.out.println(rate);
            System.out.println(calculateInterest(10000.0, i));

        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return true;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++ ){
            if (n % i == 0){
                return false;
            }

        }
        return true;
    }
}
