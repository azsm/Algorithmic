class PassingCar {
    public int solution(int[] A) {
        int result = 0;
        
        int count_1 = 0;
        for(int i = A.length - 1; i >= 0; i--) {
            if(A[i] == 1) 
                count_1 ++;
            else 
                result += count_1;
                if(result > 1000000000)
                    return -1;
        }
        
        return result;
    }
}

