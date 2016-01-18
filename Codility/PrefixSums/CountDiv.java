class CountDiv {
    public int solution(int A, int B, int K) {
        int result = 0;

        if(A % K == 0) 
            result ++;   
        else 
            A = A + (K - A % K);
        
        return (B - A > 0) ? (1 + (B - A) / K) : result;    
    }
}
