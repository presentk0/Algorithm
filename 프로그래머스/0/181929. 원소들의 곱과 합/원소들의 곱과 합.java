class Solution {
    public int solution(int[] num_list) {
        int mul = num_list[0];
        int square = 0;
        
        for(int i=1;i<num_list.length;i++) {
            mul*=num_list[i];
        }
        
        for(int i=0;i<num_list.length;i++) {
            square+=num_list[i];
        }
        square=square*square;
        
        return mul<square?1:0;
    }
}