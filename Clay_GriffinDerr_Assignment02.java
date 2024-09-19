import javax.swing.JOptionPane;
public class Clay_GriffinDerr_Assignment02 {

	public static void main(String[] args) {
		String firstName, lastName;
		char middleInitial;
		int age;
		double grossAnnualPay, taxRate, netAnnualPay;
		
		firstName = JOptionPane.showInputDialog(null, "First Name: ");
		middleInitial = JOptionPane.showInputDialog(null, "Middle Initial: ").charAt(0);
		lastName = JOptionPane.showInputDialog(null, "Last Name: ");
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Age: "));
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog(null, "Gross Annual Pay: "));
		taxRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Tax Rate: "));
		
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		
		
		System.out.printf("Hello %s %c. %s,\n", firstName, middleInitial, lastName);
		System.out.printf("You are %d years old now.\n", age);
		System.out.printf("It is amazing that you made $%.2f this year. With the tax\n", grossAnnualPay);
		System.out.printf("rate of %.2f, you can take home $%.2f.\n", taxRate, netAnnualPay);
		

	}

}
