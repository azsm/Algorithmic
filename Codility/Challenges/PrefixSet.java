class PrefixSet {
    public int solution(int[] A) {
        int N = A.length;
        
        int[] occurrenceTab = new int[N];
        
        for(int val : A) {
            occurrenceTab[val]++;
        }
        
        int i = N - 1;
        while(i >= 0 && occurrenceTab[A[i]] > 1) {
            occurrenceTab[A[i]]--;
            i--;
        }
        
        return i;        
    }
}
