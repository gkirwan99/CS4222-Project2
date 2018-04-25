public class test3 {
	public static void main() {
		public static timeToSlotNum(String time) {
			int slotNum ;
			switch (time) {
				case ("09h00"): 
					slotNum = 1 ;
					break ;
				case ("10h00"): 
					slotNum = 2 ; 
					break ;
				case ("11h00"): 
					slotNum = 3 ;
					break ;
				case ("12h00"): 
					slotNum = 4 ;
					break ;				
				case ("13h00"): 
					slotNum = 5 ;
					break;
				case ("14h00"): 
					slotNum = 6 ;
					break;
				case ("15h00"): 
					slotNum = 7 ; 
					break ;
				case ("16h00"): 
					slotNum = 8 ;
					break ;
				case ("17h00"): 
					slotNum = 9 ;
					break ;				
				case ("18h00"): 
					slotNum = 10 ;
					break;
				default: 
					JOptionPane.showMessageDialog(null, "Format error or time not in range") ;
			}
		}
	}
}