// https://www.codingninjas.com/studio/problems/count-ways-to-reach-nth-stairs_798650?source=youtube&campaign=striver_dp_videos&leftPanelTabValue=PROBLEM&customSource=studio_nav
import java.util.* ;
import java.io.*; 
public class cn1_climbStairs {
	public static int countDistinctWayToClimbStair(long nStairs) {
		// Write your code here.
		return tell4(nStairs);
	}
	private static int tell4(long n) {
        //most optimised
        if(n==0 || n==1 ) return 1;
        
        long prev=1;
        long prev2=1;

        for(long i=2;i<=n;i++){
            long curri=(prev+prev2)%1000000007;
            prev2=prev;
            prev=curri;
        }

        return (int)prev;
    }
}