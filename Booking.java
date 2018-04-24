public class Booking {
	
	private LocalDateTime dateTime;
	private Facility facility;

	public Booking(LocalDateTime dateTime, Facility facility) {
		this.dateTime = dateTime;
		this.facility = facility;
	}
		
}