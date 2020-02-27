public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Sam", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(4, 8);
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " score " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player score " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed Player score points.");
        return 1000;
    }

    public static double calcFeetAndInchesToCentimeters(int inches, int feet){
        if ((inches < 0) || (inches >=12) || feet < 0){
            return -1;
        }
        else{
            inches = inches +  12*feet;
            double centimeters = inches *2.54;
            System.out.println(centimeters);
            return centimeters;
        }

    }
    public static double calcFeetAndInchesToCentimeters(int inches){
        int feet = Math.floorDiv(inches, 12);
        inches = inches % 12;
        double centimeters =  calcFeetAndInchesToCentimeters(inches, feet);
        System.out.println(feet + " feet and " + inches + " inches is equal to " + centimeters + " centimeters");
        return centimeters;
    }
}
