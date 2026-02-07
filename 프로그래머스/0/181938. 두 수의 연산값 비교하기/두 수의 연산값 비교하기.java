class Solution {
    public int solution(int a, int b) {
        int inputA = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int inputB = 2*a*b;
        return inputA>inputB?inputA:inputB;
    }
}