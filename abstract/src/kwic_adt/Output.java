package kwic_adt;

public class Output {

	public void print(Alphabetizer alpha) {
		int size = alpha.getLineCount();
		
		for( int i = 0; i < size; ++i ) {
			// printing each line
			System.out.println(alpha.getLine(i));
		}
	}
}