import java.util.*;

public class BusSeatAllotment {
    public static void main(String[] args) {
        int totalSeats = 40;
        Set<Integer> bookedSeats = new HashSet<>();
        int[] preferredSeats = {3, 5, 12, 5, 11};

        for (int seat : preferredSeats) {
            if (seat < 1 || seat > totalSeats) {
                System.out.println("Seat " + seat + " Invalid");
            } else if (bookedSeats.contains(seat)) {
                System.out.println("Seat " + seat + " Already Booked");
            } else {
                bookedSeats.add(seat);
                System.out.println("Seat " + seat + " Booked");
            }
        }
    }
}
