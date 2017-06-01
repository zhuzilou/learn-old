import java.time.Clock;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class FunctionInterface {
	public static void main(String[] args) {
		// New Map
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			map.putIfAbsent(i, "val" + i);
		}

		map.forEach((id, val) -> System.out.println(val));

		map.computeIfPresent(3, (num, val) -> val + num);
		map.get(3); // val33
		System.out.println(map.get(3));

		map.computeIfPresent(9, (num, val) -> null);
		map.containsKey(9); // false
		System.out.println(map.containsKey(9));

		map.computeIfAbsent(23, num -> "val" + num);
		map.containsKey(23); // true
		System.out.println(map.get(23));

		map.computeIfAbsent(3, num -> "bam");
		map.get(3); // val33
		System.out.println(map.get(3));

		System.out.println(map.getOrDefault(3, "default"));
		System.out.println(map.getOrDefault(9, "default"));

		// New Date
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		System.out.println(millis);

		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant); // legacy java.util.Date
		System.out.println(legacyDate);

		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
			System.out.println("filter: " + s);
			return true;
		}).forEach(s -> System.out.println("forEach: " + s));

		// Parallel stream
		// (-Djava.util.concurrent.ForkJoinPool.common.parallelism=5)
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		System.out.println(commonPool.getParallelism());

		Arrays.asList("a1", "a2", "b1", "c2", "c1").parallelStream().filter(s -> {
			System.out.format("filter: %s [%s]\n", s, Thread.currentThread().getName());
			return true;
		}).map(s -> {
			System.out.format("map: %s [%s]\n", s, Thread.currentThread().getName());
			return s.toUpperCase();
		}).forEach(s -> System.out.format("forEach: %s [%s]\n", s, Thread.currentThread().getName()));

	}
}
