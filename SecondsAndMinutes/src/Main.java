public class Main {

    public static void main(String[] args) {
        getDurationString(70, 45);
        getDurationString(3950);
    }

    public static void getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            System.out.println("Invalid Input");
        }
        else{
            int hours = Math.floorDiv(minutes, 60);
            minutes = minutes % 60;
            String hoursString = hours + "h";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }
            String minutesString = minutes + "m";
            if (minutes < 10){
                minutesString = "0" + minutesString;
            }
            System.out.println(hoursString + " " + minutesString + " " + secondsString);
        }
    }
    public static void getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("Invalid Input");
        }
        else{
            int minutes = Math.floorDiv(seconds, 60);
            int remaining_seconds = seconds % 60;
//            System.out.println(remaining_seconds);
//            System.out.println(minutes);
            getDurationString(minutes, remaining_seconds);
        }
    }
}
