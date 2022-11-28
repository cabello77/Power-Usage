/* This is a stub code. You can modify it as you wish. */

import java.io.File;
import java.util.Scanner;
class AppClient{
	
	public void readAppFile(String file){ // method to read the comma seperated appliance file.
		Scanner scan;
		try {
			File myFile=new File(file);
			scan=new Scanner(myFile);//each line has the format
			//locationID,name of app,onPower,probability of staying on, smart or not,Smart appliances (if "on") power reduction percent when changed to "low" status(floating point, i.e..33=33%).
			String str;
			int locationID;
			String appName;
			int onPower;
			float probOn;
			String appType;
			int lowPower;
			Appliance aAppl;
			
			/*Complete the method*/
			scan.close();
		}catch(IOException ioe){ 
			System.out.println("The file can not be read");
		}
	}
	
	
	public static void main(String []args){
		
		AppClient app = new AppClient();
		//User interactive part
		String option1, option2;
		scan = new Scanner(System.in);
		while(true){// Application menu to be displayed to the user.
			System.out.println("Select an option:");
			System.out.println("Type \"A\" Add an appliance");
			System.out.println("Type \"D\" Delete an appliance");	
			System.out.println("Type \"L\" List the appliances");
			System.out.println("Type \"F\" Read Appliances from a file");
			System.out.println("Type \"S\" To Start the simulation");
			System.out.println("Type \"Q\" Quit the program");
			option1=scan.nextLine();
			/* Complete the skeleton code below */
		
				
		}
		
		
	}
}