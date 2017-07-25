package objectsExample;

import java.text.DecimalFormat;

public class PlayingWithNumbers {
	
	public static void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println("value:" + value + "pattern:"+ pattern + output);
		
	}

	public static void main(String[] args) {
//		double pi = Math.PI;
//		System.out.format("%.6f%n", pi);
//		customFormat("###.##", 12568.6987);
//		
//		double x= 12.268;
//		System.out.printf("The rint of %.2f " + "is %.0f%n", 
//                x, Math.rint(x));
//		double y = 5689.23;
//		
//		System.out.printf("The max of %.2f and " + "%.2f is %.2f%n", x, y, Math.max(x, y));
//		String testConvert;
//		int k = 65;
//		testConvert =  Integer.toString(k,16);
//		System.out.println("String" + testConvert + " Integer" + k);
		
		if (args.length == 2) {
			System.out.println("Start math operations");
		} else {
			System.out.println("Start math operations 2");
		}
	}

}
