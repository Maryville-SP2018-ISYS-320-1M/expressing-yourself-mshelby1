/*
  	ISYS 320
  	Name(s):  Matthew Shelby
  	Date:  3/18/2018
*/

public class ComputePay {
	public static void main(String[] args) {
		System.out.println( "My Total Hours Worked:");
		Hours();
		System.out.println();
		System.out.println( "My Hourly Salary:");
		Salary();
		System.out.println();
		System.out.println( "My Total Pay:");
		Pay();
	}
	
	public static void Hours() {
		System.out.println(4 + 5 + 8 + 4);
	}
	
	public static void Salary() {
		System.out.println(8.75);
	}
	
	public static void Pay() {
		System.out.println(21 * 8.75);
	}
}