package objectsExample;

public class DataStructures {
	
	private final static int size = 15;
	private int[] arrayOfInts = new int[size];
	
	public DataStructures() {
		for (int i = 0; i < size; i++) {
			arrayOfInts[i] = i;
		}
	}
	
	public void printEven() {
		DataStructuresIterator iterator = this.new EvenIterator();
		while (iterator.hasNext()) {
			
		}
		
	}
	interface DataStructuresIterator extends java.util.Iterator<Integer> {}
	
	private class EvenIterator implements DataStructuresIterator {

		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
			return (nextIndex <= size - 1);
		}

		@Override
		public Integer next() {
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex +=2;
			System.out.println(nextIndex);
			return retValue;
		}
		
	}
	
	public static void main(String[] args) {
		DataStructures ds = new DataStructures();
		System.out.print("ds.arrayOfInts" + ds.arrayOfInts[2]);
		ds.printEven();

	}

}
