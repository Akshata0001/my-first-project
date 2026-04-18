package prg2b;

public class PerformanceDemo {
	
		public static void main(String[] args) {

		// Test for StringBuffer
		StringBuffer sbuffer = new StringBuffer();
		long startTime1 = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
		sbuffer.append("AIET");
		}

		long endTime1 = System.nanoTime();
		System.out.println("Time taken by StringBuffer: " + (endTime1 - startTime1) + " ns");

		// Test for StringBuilder
		StringBuilder sbuilder = new StringBuilder();
		long startTime2 = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
		sbuilder.append("AIET");
		}

		long endTime2 = System.nanoTime();
		System.out.println("Time taken by StringBuilder: " + (endTime2 - startTime2) + " ns");

		}
		}
