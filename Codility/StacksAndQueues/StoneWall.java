import java.util.*;


class Solution {
    public int solution(int[] H) {
        Deque<Integer> stack = new LinkedList<>();
        
        int counter = 0; 
        for(int h : H) {
            while(!stack.isEmpty()) {
                int lastBlock = stack.peek();
                
                if(lastBlock > h) 
                    stack.poll();
                else {
                    if (lastBlock < h) {
                        stack.push(h);
                        counter++;
                    }
                    break;
                }
            }
            
            if(stack.isEmpty()) {
                stack.push(h);
                counter++;
            }
        }
        
        return counter;
    }
}


