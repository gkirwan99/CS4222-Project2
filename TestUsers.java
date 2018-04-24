import java.util.*;
import java.io.*;
import javax.swing.*;

public class TestUsers {
	public static void main(String[] args) throws IOException{
		File file = new File("users.txt");
		FileReader aFileReader = new FileReader(file);
		Scanner in = new Scanner(file);
		
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		
		int c = 0;
		while(in.hasNext()) {
			list.add(new ArrayList<String>());
			String[] data = in.nextLine().split(",");
			
			for(int i = 0;i < data.length;i++)
				list.get(c).add(data[i]);
			
			c++;
		}
		
		String inputUser = JOptionPane.showInputDialog(null, "enter user");
		int balChange = Integer.parseInt(JOptionPane.showInputDialog(null, "Input change in balance"));
		
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		
		for(int i = 0;i < list.size();i++) {
			
			if(inputUser.equals(list.get(i).get(0))) {
				int tempBalance = Integer.parseInt(list.get(i).get(2));
				tempBalance += balChange;
				list.get(i).set(2, "" + tempBalance);
			}	
		}
		
		for(int i = 0;i < list.size();i++) {
			pw.println(list.get(i).get(0) + "," + list.get(i).get(1) + "," + list.get(i).get(2));
		}
		
		pw.close();
		fw.close();	
	}
}