package DynamicProgramming.Assignment;

public class BuyingSellingStocks {
    public static int maxProfit(int a[], int b[], int n, int fee){
        
        int diff_day = 1, sum = 0;

        b[0] = 0;
        b[1] = diff_day;
        
        for(int i=1; i<n; i++){
            int l = 0;
            int r = diff_day;
            sum = 0;
        
            for(int j=n-1; j>=i; j--){
                int profit = (a[r] - a[l]) - fee;
                if(profit > 0){
                    sum = sum + profit;
                }
                l++;
                r++;
            }
            if(b[0] < sum){
                b[0] = sum;
                b[1] = diff_day;
            }
            diff_day++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {6, 1, 7, 2, 8, 4};
        int n = arr.length;
        int[] b = new int[2];
        int tranfee = 2;

        maxProfit(arr, b, n, tranfee);
        System.out.println(b[0]+" "+b[1]);
    }
}
