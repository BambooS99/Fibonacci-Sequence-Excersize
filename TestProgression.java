class TestProgression{
public static void main(String[] args) {
	Progression prog;
	//test FibonacciProgression
	
	System.out.println("Fibonacci progression with default start values: ");
		prog = new FibonacciProgression();
		prog.printProgression(10);
		System.out.println("Fibonacci progression with start values 4 and 6: ");
		prog = new FibonacciProgression(4,6);
		prog.printProgression(10);
 }
}