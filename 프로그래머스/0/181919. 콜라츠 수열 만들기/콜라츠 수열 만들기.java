class Solution {
    public int[] solution(int n) {
        int origin = n;
        int j = 1; 
        while(n!=1) {
            if(n%2==0) {
                n/=2;
            } else {
                n=3*n+1;
            }
            j++;
        }
        
        int[] answer = new int[j];
        answer[0] = origin;
        int i=1;
        while(origin!=1) {
            if(origin%2==0) {
                origin/=2;
            } else {
                origin=3*origin+1;
            }
            answer[i] = origin;
            i++;
        }
        
        return answer;
    }
}