import java.io.* ;
import java.util.* ;
import javax.swing.* ;
import java.time.* ;

public class test2 {
	public static void main(String[] args) throws IOException {
		
		addFacility() ;
		removeFacility() ;
		
	}
		public static void addFacility() throws IOException {
		int facilityID = 0 ;
		String facilityName ;
		double pricePerHour ;
		
		FileReader aFileReader = new FileReader("facilities.txt");
		Scanner in = new Scanner(aFileReader);
		

		
		FileWriter aFileWriter = new FileWriter("facilities.txt", true) ;
		PrintWriter out = new PrintWriter(aFileWriter) ;
		
		
		
		facilityName = JOptionPane.showInputDialog("Enter name of facility: ") ;
		boolean found = false;
		
		while(in.hasNext() && !found) {
			facilityID++;
			String[] data = in.nextLine().split(",");
			if(data[1].equalsIgnoreCase(facilityName)) {
				found = true;
				JOptionPane.showMessageDialog(null, "Error, facility already exists");				
			}
			
		}
		
		facilityID--;
		
		pricePerHour = Integer.parseInt(JOptionPane.showInputDialog("Enter price per hour: ")) ;
		out.print(facilityID + "," + facilityName + "," + pricePerHour + "," + "\n") ;
		out.close() ;
		aFileWriter.close() ;
	}
	
	
	public static ArrayList<String> getFacilities() throws IOException {
		String lineFromFile ;
		ArrayList<String> facilities = new ArrayList<String>() ;
		FileReader aFileReader = new FileReader("facilities.txt") ;
		Scanner in = new Scanner(aFileReader) ;
		while (in.hasNext()) {
			lineFromFile = in.nextLine() ;
			facilities.add(lineFromFile) ;
		}
		in.close() ;
		return facilities ;
	}
	
	public static void removeFacility() throws IOException {
		String lineFromFile ;
		String facilityToRemove = JOptionPane.showInputDialog(null, "Enter facility to remove: ") ;
		ArrayList<String> facilities = getFacilities() ;
		FileWriter aFileWriter = new FileWriter("facilities.txt") ;
		PrintWriter out = new PrintWriter(aFileWriter) ;
		for (int i = 0; i < facilities.size(); i++) {
			if (!(facilities.get(i).contains(facilityToRemove))) {
				out.print(facilities.get(i) + "\n") ;
			}
		}
		out.close() ;
		aFileWriter.close() ;
		JOptionPane.showMessageDialog(null, "Facility Removed") ;
	}
	
}