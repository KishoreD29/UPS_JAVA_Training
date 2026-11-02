
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class one {
    public static void main(String[] args) {
        
        List<Integer> nums =
                Arrays.asList(10, 20, 30, 20, 40, 50);

        // 1. filter()
        nums.stream()
            .filter(n -> n > 20)
            .forEach(System.out::println);

        // 2. map()
        nums.stream()
            .map(n -> n * 2)
            .forEach(System.out::println);

        // 3. sorted()
        nums.stream()
            .sorted()
            .forEach(System.out::println);

        // 4. distinct()
        nums.stream()
            .distinct()
            .forEach(System.out::println);

        // 5. count()
        long count = nums.stream()
                          .filter(n -> n > 20)
                          .count();

        System.out.println("Count: " + count);

        // 6. collect()
        List<Integer> result = nums.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        System.out.println(result);

        // 7. reduce()
        int sum = nums.stream()
                      .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);

        // 8. max()
        Optional<Integer> max = nums.stream()
                                    .max(Integer::compareTo);

        System.out.println(max.orElse(0));
    }
}
