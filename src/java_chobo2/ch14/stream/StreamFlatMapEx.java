package java_chobo2.ch14.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMapEx {

	public static void main(String[] args) {
//		extracted01();
		extracted02();

		
		
		
		
		
						
	}

	public static void extracted02() {
		String[][] namesArray = new String[][]{
			{"kim", "taeng"}, {"mad", "play"}};

		// flatMap
		Arrays.stream(namesArray)
			.flatMap(inner -> Arrays.stream(inner))
			.forEach(System.out::println);
		
		System.out.println();

		// map
		Arrays.stream(namesArray)
			.map(inner -> Arrays.stream(inner))
//		.forEach(System.out::println);
			.forEach(names -> names.forEach(System.out::println));
	}

	public static void extracted01() {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] { "abc", "def", "jkl" },
				new String[] { "ABC", "GHI", "JKL" });

		
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

		strStrm.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
				"Believe or not It is true",
				"DO or do not There is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))
		.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		System.out.println();
	}

}
