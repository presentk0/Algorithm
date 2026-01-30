class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String str = control;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='w') {
                n+=1;
            } else if(str.charAt(i)=='s') {
                n-=1;
            } else if(str.charAt(i)=='d') {
                n+=10;
            } else if(str.charAt(i)=='a') {
                n-=10;
            } 
        }
        answer=n;
        return answer;
    }
}