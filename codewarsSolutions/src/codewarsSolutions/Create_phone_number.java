package codewarsSolutions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Create_phone_number {// 6kyu

	public static String createPhoneNumber(int[] numbers) { //mine
		String s = Arrays.stream(numbers).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining());

		return String.format("(%s) %s-%s", s.substring(0, 3), s.substring(3, 6), s.substring(6));

	}

	public static String createPhoneNumber1(int[] numbers) { //another smart solution
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
	}
	
	

	public static void main(String[] args) {

		String string = createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
		System.out.println(string);
	}

}
