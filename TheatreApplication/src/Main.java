public class Main {
    public static void main(String[] args) {
        Theatre.Seat seat = new Theatre.Seat('A',1);
        Theatre.Seat newseat = new Theatre.Seat('A',2);
        Theatre NewTheatre = new Theatre("Ashok Theatre");
        System.out.println("Welcome to "+NewTheatre.getTheatrename());
        NewTheatre.Addseats(newseat);
        NewTheatre.Printseats();
        NewTheatre.Addseats(seat);
        System.out.println("//////////////////////Re-adding the same seat/////////////////////////");
        NewTheatre.Addseats(seat);
        System.out.println("///////////////////////////Displaying Booked Seats////////////////////////////////");
        NewTheatre.DisplayBookedSeats();
        System.out.println("/////////Removing A01 Seat or Cancelling its booking/////////////");
        NewTheatre.RemoveBookedSeat(seat);
        System.out.println("///////////////////////////Displaying Booked Seats////////////////////////////////");
        NewTheatre.DisplayBookedSeats();
        System.out.println("////////////////RE-BOOKING A01//////////////");
        NewTheatre.Addseats(seat);
        System.out.println("//////////Finding a perticluar seat/////////////////");
        NewTheatre.FindSeat(seat);
        NewTheatre.FindSeat(newseat);
//        NewTheatre.BookaSeat(new Theatre.Seats(1,'A'));
//        NewTheatre.Printseats();
//        NewTheatre.BookaSeat(new Theatre.Seats(1,'A'));
//        NewTheatre.PrintAvailableSeats();
//        NewTheatre.Printseats();
//        NewTheatre.Addseats(new Theatre.Seat('A',2));
//        NewTheatre.Addseats(new Theatre.Seat('A',2));

//        System.out.println(seat.getRow());
//        System.out.println(String.format("%02d",seat.getSeatnumber()));
    }
}
