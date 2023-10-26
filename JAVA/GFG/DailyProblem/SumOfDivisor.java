package DailyProblem;

class sumOfDivisors{
    static long sumOfDivisorss(int N){
        // code here
        int sum_i=0;
        for(int i=1;i<=N;i++){
            int j=1;
            int sum_j=0;
            while(j<=i){
                if(i%j==0){
                sum_j+=j;
            }
            sum_i+=sum_j;
        }
    }
        return sum_i;
}
}
