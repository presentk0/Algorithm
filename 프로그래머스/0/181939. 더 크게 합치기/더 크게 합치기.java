class Solution {
    public int solution(int a, int b) {
        int solA = Integer.parseInt(""+a+b);
        int solB = Integer.parseInt(""+b+a);
        return solA>=solB?solA:solB;
    }
}