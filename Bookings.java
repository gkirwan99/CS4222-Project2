import java.util.* ;
import java.time.* ;

public class Bookings {
	private int bookingID ;
	private int facilityID ;
	private int userID ;
	private LocalDate date ;
	private int slotNum ;
	private char paymentStatus ;
	
	public Bookings(int aBookingID, int aFacilityID, int aUserID, LocalDate aDate, int aSlotNum, char aPaymentStatus) {
		bookingID = aBookingID ;
		facilityID = aFacilityID ;
		userID = aUserID ;
		date = aDate ;
		slotNum = aSlotNum ;
		paymentStatus = aPaymentStatus ;
	}
		
		public int getBookingID() {
			return bookingID ;
		}
		
		public int getFacilityID() {
			return facilityID ;
		}
		
		public int getUserID() {
			return userID ;
		}
		
		public LocalDate getDate() {
			return date ;
		}
		
		public int getSlotNum() {
			return slotNum ;
		}
		
		public char getPaymentStatus() {
			return paymentStatus ;
		}
		
}

