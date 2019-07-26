//Fibonacci 

class FibonacciProgression extends Progression{
	//previous value
	long prev;
	//inherits values first and cur 
	
	//set the default constructor values for the first two values as 0 and 1
	FibonacciProgression() {
		this(0,1);
	}
	
	FibonacciProgression(long value1, long value2) {
		first  = value1;
		prev = value2 - value1; //fictitious value preceding the first 
	}
	
	//advances the progression by adding the previous value to the current value 
	
	protected long nextValue() {
		long temp = prev;
		prev = cur;
		cur += temp;
		return cur;
	}
	//inherits methods firstValue() and printProgression(int)
	
}



