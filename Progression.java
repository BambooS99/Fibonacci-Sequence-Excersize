public class Progression {
	protected long first;
	protected long cur;
	
	Progression() {
	cur = first = 0;
	}
	//resets the progression to the first value
	protected long firstValue() {
		cur = first;
		return cur;
	}
	
	protected long nextValue() {
		return++cur; //default next value
		
	}
	
	public void printProgression(int n) {
		System.out.print(firstValue());
	for (int i = 2; i<= n; i++)
	System.out.println(" " + nextValue());
	System.out.println(); // end the line 
	
	
	}
	
}

