public class VerifyStringInterleaving {
    public int isInterleave(String s1, String s2, String s3) {
        boolean[][] matrix = new boolean[s1.length()+1][s2.length()+1];

        if(s3.length() != s1.length() + s2.length()) {
            return 0;
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(i == 0 && j == 0 ) {
                    matrix[0][0] = true;
                }
                else if(j == 0 && i != 0) {
                    matrix[i][j] = s1.charAt(i - 1) == s3.charAt(i -1) && matrix[i-1][j];
                }
                else if(i == 0 && j != 0) {
                    matrix[i][j] = s2.charAt(j - 1) == s3.charAt(j -1) && matrix[i][j-1];
                }
                else {
                    matrix[i][j] = (s1.charAt(i - 1) == s3.charAt(i + j -1) && matrix[i-1][j]) 
                    || s2.charAt(j - 1) == s3.charAt(j + i -1) && matrix[i][j-1];
                }
            }
        }

        return matrix[s1.length()][s2.length()] ? 1 : 0;

    }
}

