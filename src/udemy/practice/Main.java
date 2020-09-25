package udemy.practice;

public class Main {

    public static void main(String[] args) {

        shouldWakeUp(true, 4);


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking && (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23)) {
            return true;
        } else if (hourOfDay < 0) {
            return false;
        }

        return false;
    }
}
