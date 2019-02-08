import java.io.Console;

class NaturalLogFactorial {
	private static long getFactorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n*getFactorial(n-1);
	}
	private static double getNaturalLog(int n) {
		return (double)Math.log(getFactorial(n));
	}
	public static void main (String args[]) {
		Console con = System.console();
		System.out.print("Enter the value = ");
		int n = Integer.parseInt(con.readLine());
		System.out.println("Answer = "+getNaturalLog(n));
	}
}