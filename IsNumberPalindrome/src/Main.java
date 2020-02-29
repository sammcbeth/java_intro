public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
    }

    public static boolean isPalindrome(int number){
        int count = 0;
        int temp = number;
        while(temp >= 10){
            count += 1;
            temp /= 10;
        }

        while (number >= 10){
            System.out.println(number);
            System.out.println((int)Math.pow(10, count));
            int back = number % 10;
            int front = number / (int)Math.pow(10, count);
            number %= (int)Math.pow(10, count);
            number /= 10;
            if (back != front){
                return false;
            }
            count -= 2;

        }
        return true;

    }
}
