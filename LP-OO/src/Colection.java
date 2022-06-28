import java.lang.reflect.Array;
import java.util.*;

import javax.swing.Box.Filler;
public class Colection {
	private int intArray[] = {1,2,3,4,5,6};
	private double doubleArray[] = {8.4, 9.3, 0.2,7.9,3.4};
	private int filledIntArray[], intArrayCopy[];	
	public Colection() {
		filledIntArray = new int [10];
		intArrayCopy = new int [intArray.length];		
		Arrays.fill(filledIntArray, 7);
		Arrays.sort(doubleArray);		
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
	}	
	public void printArrays() {
		System.out.print("\ndouble Array: ");
		for (double doubleValue:doubleArray)
			System.out.printf("[%.1f] ", doubleValue);
		System.out.println("\nint Array: ");
		for (int intValue:intArray)
			System.out.printf("%d", intValue);
		System.out.println("\nfilled Array: ");
		for (int filledValue:filledIntArray)
			System.out.printf("%d", filledValue);
		System.out.println("\nint Copy Array: ");
		for (int intValue:intArrayCopy)
			System.out.printf("%d", intValue);
		}	
	public int searchForInt(int value) {
		return Arrays.binarySearch(intArray, value);		
	}
	public void printEquals() {
		Boolean b = Arrays.equals(intArray, intArrayCopy);	
		System.out.printf("\n intArray %s intArrayCopy", (b ? "==":"!="));		
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("\n intArray %s filledIntArrayCopy", (b ? "==":"!="));
	}
		
}
