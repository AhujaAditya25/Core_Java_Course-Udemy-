import java.util.ArrayList;

public class Theatre {

    public final String theatrename;
    private final int maxrows = 'A'+8;
    private final int maxseats = 10;
    private ArrayList<Seat> seats = new ArrayList<>();

    public void Addseats(Seat seat){
        if (!seats.contains(seat)){
           seats.add(seat);
            System.out.println("Seat is booked !");
        }
        else System.out.println("Seat Unavailable");
    }
    public void DisplayBookedSeats(){
        System.out.println("The seats already booked are :");
        for (int i = 0; i<seats.size();i++){
            System.out.println(seats.get(i).row +String.format("%02d",seats.get(i).seatnumber));
        }
    }

    public void RemoveBookedSeat(Seat seat){
        if (seats.contains(seat)){
            System.out.println("seat "+seat.getRow()+String.format("%02d",seat.getSeatnumber())+" is removed");
            seats.remove(seat);
        }
        else System.out.println("Seat you're trying to remove was never booked.");
    }

    public void FindSeat(Seat seat){
        System.out.println("Looking for confirmation that , the seat you're trying to search is booked!");
        if (seats.contains(seat)){
            int seatno=seats.indexOf(seat);
            System.out.println("Found your seat at "+seatno+" in the list . Your booking is confirmed!");
        }
        else
            System.out.println("Couldn't find the seat your're looking for!");
    }

    public Theatre(String theatrename) {
        this.theatrename = theatrename;
    }

    public String getTheatrename() {
        return theatrename;
    }

    public int getMaxrows() {
        return maxrows;
    }

    public int getMaxseats() {
        return maxseats;
    }

    public void Printseats(){
        for (char row ='A';row<maxrows;row++){
            for (int seatnum = 1;seatnum<=maxseats; seatnum++){
                System.out.println(row+String.format("%02d",seatnum));
            }
        }
    }








    public static class Seat{
        public char row;
        public int seatnumber=1;

        public Seat(char row, int seatnumber) {
            this.row = row;
            this.seatnumber = seatnumber;
        }

        public char getRow() {
            return row;
        }

        public int getSeatnumber() {
            return seatnumber;
        }
    }
}
