import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Deque<Integer> stack = new LinkedList<>(); 
        
        for(int i = 0; i < A.length; i++) {
            
            if(B[i] == 1) 
                stack.push(i);
            else {
                Integer nearst = stack.peek(); 
                while(nearst != null && B[nearst] == 1 && A[nearst] < A[i]) {
                    stack.poll();
                    nearst = stack.peek(); 
                }
                
                if(nearst == null || B[nearst] == 0)
                    stack.push(i);
            }
        }
        
        return stack.size();
    }
}
