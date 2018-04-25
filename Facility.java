public class Facilities {
	
	private int facilityID ;
	private String facilityName ;
	private int pricePerHour ;
	private Date decomissionedUntilDate ;
	
	facility(int aFacilityID, String aFacilityName, int aPricePerHour, date aDecomissionUntilDate) {
		facilityID = aFacilityID ;
		facilityName = aFacilityName ;
		pricePerHour = aPricePerHour ;
		decomissionedUntilDate = aDecomissionUntilDate ;
	}
	
	public int getFacilityID() {
		return facilityID ;
	}
	
	public getFacilityName() {
		return facilityName ;
	}
	
	public getPricePerHour() {
		return pricePerHour ;
	}
	
	public getDecommisionedUntilDate() {
		return decomissionedUntilDate ;
	}
}