package codewarsSolutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Emirps {

	static long startTime = System.currentTimeMillis();

	public static boolean isPrime(int num) {
		return IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch(n -> num % n != 0);

	}

	public static List<Integer> primesUntil(long num) {

		return IntStream.range(2, (int) num).filter(n -> isPrime(n)).boxed().collect(Collectors.toList());
	}

	public static long[] findEmirp(long num) {

		List<Integer> emirps = primesUntil(num).stream().filter(i -> isEmirp(i)).collect(Collectors.toList());

		emirps.forEach(n -> {
			System.out.println(n);
		});

		long numberOfEmirps = emirps.size();
		long largestEmirp = emirps.get(emirps.size() - 1);
		long sum = emirps.stream().mapToInt(i -> i).sum();

		return new long[] { numberOfEmirps, largestEmirp, sum };
	}

	public static boolean isEmirp(Integer i) {
		StringBuilder str = new StringBuilder(i.toString());

		if (!(str.toString().equals(str.reverse().toString()))) {
			System.out.println(Integer.valueOf(str.reverse().toString()) + " "
					+ isPrime(Integer.valueOf(str.reverse().toString())));
			return isPrime(Integer.valueOf(str.reverse().toString()));
		}
		return false;

	}

	public static void main(String args[]) {

		Arrays.stream(findEmirp(50)).forEach(n -> {
			System.out.print(n + " ");
		});

		StringBuilder str = new StringBuilder("767");

		System.out.println(!str.toString().equals(str.reverse().toString()));

		long endTime = System.currentTimeMillis();
		System.out.printf("program took %.4f seconds", (float) (endTime - startTime) / 1000);
	}
}
