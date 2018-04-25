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
		
		pricePerHour = Integer.parseInt(JOptionPane.showInputDialog("Enter price per hour: ")) ;
		out.print(facilityID + "," + facilityName + "," + pricePerHour + "," + "\n") ;
		out.close() ;
		aFileWriter.close() ;
}