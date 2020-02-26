public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{

        int megabytes = Math.floorDiv(kiloBytes, 1024);
        int remainder = kiloBytes - (megabytes*1024);
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder+ " KB");
        }
    }
}
