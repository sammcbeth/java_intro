public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));

    }
    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
        else if(number % 2 == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){

        if(end < start){
            return -1;
        }
        else if(start < 0)
        {
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if (isOdd(i)){
                sum += i;
            }

        }
        return sum;
    }
}
