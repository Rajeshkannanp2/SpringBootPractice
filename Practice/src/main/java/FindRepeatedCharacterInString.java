import java.security.Identity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check = "ammaappapaaaammmmmmmaaa";
		
		
		HashMap<Character, Integer> count1 = new HashMap<Character, Integer>();
		
		char[] words = check.toCharArray();
		
		for(Character c:words) {
			if(count1.containsKey(c)) {
				count1.put(c, count1.get(c)+1);
			}else {
				count1.put(c, 1);
			}
		}
		//System.out.println(count1);
		
		
		Map<Character, Long> checkss = check.chars()
				.mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		
		String s = "welcome to code decode code decode welcome you";
		List<String> ss=Arrays.asList(s.split(" "));
		Map<String, Long> sss = ss.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		
		System.out.println(sss);
	}

}
