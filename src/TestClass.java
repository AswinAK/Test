import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TestClass {

		public static void main(String args[]){
			
			
			Date userDOB=null;
			String dateString = "2000-09-09 00:00:00.0";
			
			String sql_get_sick_patients = "SELECT P.PID, P.NAME, P.ADDRESS, P.GENDER, P.EMAIL"
					+ " FROM PATIENT P, AUTH_SUPPORTER_WELL A"
					+ " WHERE P.PID = A.PID AND A.PRIMARY_HID = ? OR A.SECONDARY_HID = ?";
		//	System.out.println(sql_get_sick_patients);
			//boolean valid = isThisDateValid(dateString, "MM/dd/yyyy");
		//	System.out.println("\nValue is: "+valid);
			
			
			String input = "09/10/2016 17:30";
			System.out.println("VALIDITY: "+isThisDateValid(input, "MM/dd/yyyy HH:mm"));
			
			
			
	 }
			

		 public static int[] arrayLeftRotation(int[] a, int n, int k) {
		        
		        int cycle_element =0,j=0;
		        for(int i =0;i<k;i++){
		            cycle_element = a[0];
		            
		            for(j = 1;j<=n-1;j++)
		                a[j-1]=a[j];
		            System.out.println(a);
		            a[n-1] = cycle_element;
		        }
		        
		      return a;
		    }
			
//			System.out.println("Current date is "+df.format(current));
			
//			Date userDOB=null;
//			String dateString;
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter Date");
//			dateString = input.nextLine();
//			String inputS;
//			System.out.println("\nDate entered is "+dateString);
//			
//			boolean valid = isThisDateValid(dateString, "MM/dd/yyyy");
//			System.out.println("\nValue is: "+valid);
//			
//			try {
//		        userDOB = df.parse(dateString);
//		        
//			} catch (ParseException e) {
//		        e.printStackTrace();
//			}
//			
//			
//			System.out.println("Converted date month = "+userDOB.getMonth());
//			System.out.println("Converted date day = "+userDOB.getDay());
//			
//			//DateFormat df = new SimpleDateFormat("DD/MM/YYYY"); 
//			System.out.println("Converted date is: "+df.format(userDOB));
//			
////			try {
////				System.in.read();
////			} catch (IOException e) {
////				e.printStackTrace();
////			}
//			
//			inputS = input.nextLine();
//			
//			System.out.println("HERE");
			
			
			
		 
		 
		 public static boolean isThisDateValid(String dateToValidate, String dateFromat){
				if(dateToValidate == null)
					return false;
				SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
				sdf.setLenient(false);
			try {
					Date date = sdf.parse(dateToValidate);
					System.out.println(date);
				} catch (ParseException e) {
					return false;
				}
			return true;
			}
		
		
		
		
	
}

