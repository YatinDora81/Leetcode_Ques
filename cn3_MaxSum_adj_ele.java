// // Maximum sum of non-adjacent elements
// // https://www.codingninjas.com/studio/problems/maximum-sum-of-non-adjacent-elements_843261?source=youtube&campaign=striver_dp_videos&leftPanelTabValue=PROBLEM


// import java.util.*;
// public class cn3_MaxSum_adj_ele{
//     public static void main(String[] args) {
//         int arr[]={2,1,4,9};
//         //we not have to pick adjcent element

//         // //1.recursion
//         // int ans1=solve1(arr.length-1 , arr);
//         // System.out.println(ans1);


//         int dp[]=new int[arr.length];
//         Arrays.fill(dp,-1);

//         // //2.Memoization
//         // int ans2=solve2(arr.length-1 , arr , dp);
//         // System.out.println(ans2);

//         // //3.Tabulation
//         // int ans3=solve3(arr , dp);
//         // System.out.println(ans3);

//         // //4.Most Optimized
//         int ans4=solve4(arr);
//         System.out.println("Most Optimized ans is -> " + ans4);
//     }


//     private static int solve4( int[] arr) {
//         //Most Optimized
//         int prev1= arr[0];
// 		int prev2=0;
        
// 		for(int i=1;i<arr.length;i++){
// 			int pick= arr[i] ;
// 			if(i>1) pick+=prev2;
//         	int notpick= 0 + prev1;

// 			int curri=Math.max(pick, notpick);
//             prev2=prev1;
//             prev1=curri;
// 		}

        
//         return prev1 ;
//     }


//     private static int solve3( int[] arr,int dp[]) {
//         //Tabulation
//         dp[0]= arr[0];
// 		int neg=0;
        
// 		for(int i=1;i<arr.length;i++){
// 			int pick= arr[i] ;
// 			if(i>1) pick+=dp[i-2];
//         	int notpick= 0 + dp[i-1];

// 			dp[i]=Math.max(pick, notpick);
// 		}

        
//         return dp[arr.length-1] ;
//     }

//     private static int solve2(int i , int[] arr,int dp[]) {
//         //memoization
//         if(i==0) return arr[i];
//         if(i<0) return 0;
//         if(dp[i]!=-1) return dp[i];
//         int pick= arr[i] + solve2(i-2, arr,dp);
//         int notpick= solve2(i-1, arr,dp);
//         return dp[i]=Math.max(pick, notpick);
//     }

//     private static int solve1(int i , int[] arr) {
//         //recursion
//         if(i==0) return arr[i];
//         if(i<0) return 0;

//         int pick= arr[i] + solve1(i-2, arr);
//         int notpick= solve1(i-1, arr);
//         return Math.max(pick, notpick);
//     }
// }