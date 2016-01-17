

import java.util.*;

class Backets {
    public int solution(String S) {
        Deque<Character> stack = new LinkedList<>();
        
        for(char c : S.toCharArray()) {
            if(c == '[' || c == '(' || c == '{')
                stack.push(c);
            else {
                Character stackHead = stack.poll(); 
                if(stackHead == null)
                    return 0; 
                    
                char head = stackHead.charValue();
                switch(c) {
                    case ')' :  if(head != '(')
                                    return 0;
                                break;
                    case ']' :  if(head != '[')
                                    return 0;
                                break;
                    case '}' :  if(head != '{')
                                    return 0;
                                break;
                    default  :  return 0;

                };
            }
        }
        
        if(stack.isEmpty()) 
            return 1;
        else 
            return 0;
     }
}


