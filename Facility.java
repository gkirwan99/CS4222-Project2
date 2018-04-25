import java.time.* ;

public class Facilities {
	
	private int facilityID ;
	private String facilityName ;
	private int pricePerHour ;
	private Localate decomissionedUntilDate ;
	
	Facility(int aFacilityID, String aFacilityName, int aPricePerHour, LocalDate aDecomissionUntilDate) {
		facilityID = aFacilityID ;
		facilityName = aFacilityName ;
		pricePerHour = aPricePerHour ;
		decomissionedUntilDate = aDecomissionUntilDate ;
	}
	
	public int getFacilityID() {
		return facilityID ;
	}
	
	public void setFacilityID(int aFacilityID) {
		facilityID = aFacilityID ;
	}
	
	public getFacilityName() {
		return facilityName ;
	}
	
	public void setFacilityName(String aFacilityName) {
		facilityName = aFacilityName ;
	}
	
	public String getPricePerHour() {
		return pricePerHour ;
	}
	
	public void setPricePerHour(aPricePerHour) {
		pricePerHour = aPricePerHour ;
	}
	
	public LocalDate getDecommisionedUntilDate() {
		return decomissionedUntilDate ;
	}
	
	public void setDecommisionedUntilDate(aDecomissionUntilDate) {
		decomissionUntilDate = aDecomissionUntilDate ;
	}
}
