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
	
