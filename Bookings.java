public class Bookings {
	
	private static ArrayList<Booking> list;
	
	public Bookings() {
		list = new ArrayList<Booking>();
	}
	
	public void add(Booking booking) {
		list.add(booking);
	}
	
	public void getSize() {
		return list.size();
	}
	
	public void remove(Booking booking) {
		list.remove(booking);
	}
	
	public Booking get(int i) {
		return list.get(i);
	}
	
}