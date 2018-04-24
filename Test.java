public class Test {
	public static void main(String[] args) {
		Bookings listOfBookings = new Bookings();
		
		Booking book1 = new Booking("date", facility);
		
		listOfBookings.add(book1);
		
		listOfBookings.get(0).getDate();
	}
}