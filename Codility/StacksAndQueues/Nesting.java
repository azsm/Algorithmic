import java.util.*;

class Nesting {
    public int solution(String S) {
        
        int bracketCounter  = 0;
        for(char c : S.toCharArray()) {
            switch(c) {
                case '(' :  bracketCounter++;
                            break;
                case ')' :  bracketCounter--;
                            break;
                default  :  throw new IllegalArgumentException();
            }
            if(bracketCounter < 0)
                return 0;
        }
        
        return (bracketCounter == 0) ? 1 : 0;
    }
}
