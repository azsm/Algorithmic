import java.util.*;

class Solution {
    public int solution(String S) {
        Deque<Character> stack = new LinkedList<>();

		Map<Character, Character> mapBrackets = new HashMap<>(); 
		mapBrackets.put(')', '(');
        mapBrackets.put(']', '[');
        mapBrackets.put('}', '{');

		Set<Character> openBrackets = new HashSet<>(mapBrackets.values());	
        
        for(Character c : S.toCharArray()) {
            if(openBrackets.contains(c))
                stack.push(c);
            else {
                Character stackHead = stack.poll(); 
                if(! mapBrackets.get(c).equals(stackHead))
                    return 0; 
            }
        }
        
        return (stack.isEmpty()) ? 1 : 0; 
     }
}


