class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String result ="";
        
        for(int i=0;i<my_string.length();i++) {
            result += my_string.charAt(i);
            if(result.equals(is_prefix)) {
                answer = 1;
            }
            
        }
        return answer;
    }
}