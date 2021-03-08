package java_chobo2.ch14.stream;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class StreamForEachToArrayEx {

	public static void main(String[] args) {
		IntStream.range(1, 10).sequential().forEach(new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.print(value);
			}
		});
		System.out.println();
		
		IntStream.range(1, 10).parallel().forEach(e -> System.out.print(e));
		System.out.println();
		
		IntStream.range(1, 10).parallel().forEachOrdered(System.out::print);
		System.out.println();
		
		
	}

}
