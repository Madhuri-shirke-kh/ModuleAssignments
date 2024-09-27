public class AirplaneSeating {
    
    private boolean[][] seats;

    
    public AirplaneSeating(int rows, int columns) {
        seats = new boolean[rows][columns];
    }

    
    public void bookSeat(int row, int col) {
        if (isValidSeat(row, col)) {
            if (!seats[row][col]) {
                seats[row][col] = true;
                System.out.println("Seat (" + row + ", " + col + ") booked successfully.");
            } else {
                System.out.println("Seat (" + row + ", " + col + ") is already booked.");
            }
        } else {
            System.out.println("Invalid seat selection.");
        }
    }

   
    public void cancelBooking(int row, int col) {
        if (isValidSeat(row, col)) {
            if (seats[row][col]) {
                seats[row][col] = false; // Mark seat as available
                System.out.println("Booking for seat (" + row + ", " + col + ") cancelled.");
            } else {
                System.out.println("Seat (" + row + ", " + col + ") is not booked.");
            }
        } else {
            System.out.println("Invalid seat selection.");
        }
    }

    // Method to check seat availability
    public boolean isSeatAvailable(int row, int col) {
        if (isValidSeat(row, col)) {
            return !seats[row][col];
        } else {
            System.out.println("Invalid seat selection.");
            return false;
        }
    }

    
    public void displaySeatingChart() {
        System.out.println("Seating Chart (0 = Available, 1 = Booked):");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print((seats[i][j] ? "1 " : "0 ") + " ");
            }
            System.out.println();
        }
    }

    
    private boolean isValidSeat(int row, int col) {
        return row >= 0 && row < seats.length && col >= 0 && col < seats[0].length;
    }

    
    public static void main(String[] args) {
        
        AirplaneSeating airplane = new AirplaneSeating(5, 4);

        
        airplane.displaySeatingChart();

        
        airplane.bookSeat(0, 0);
        airplane.bookSeat(2, 3);
        airplane.bookSeat(4, 1);

        
        airplane.displaySeatingChart();

        
        System.out.println("Seat (2, 3) available? " + airplane.isSeatAvailable(2, 3));
        System.out.println("Seat (1, 1) available? " + airplane.isSeatAvailable(1, 1));

        
        airplane.cancelBooking(2, 3);

       
        airplane.displaySeatingChart();
    }
}