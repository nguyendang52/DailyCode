public class day3prob12 {

    // problem #12
    //There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. 
    //Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
    //For example, if N is 4, then there are 5 unique ways:
    //1, 1, 1, 1;
    //2, 1, 1
    //1, 2, 1
    //1, 1, 2
    //2, 2
    //What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X
    //    ? For example, if X  = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time
    static int Solution(int nSteps) {
        if(nSteps<=1){
            return 1;
        }
        int[] dp = new int[nSteps];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i<nSteps; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[nSteps-1];
    }
    public static void main(String[] args) {
        int nSteps;
        Scanner in = new Scanner(System.in);
        System.out.println("Input N Floors");
        nSteps = in.nextInt();
        System.out.println(Solution(nSteps));
    }
}