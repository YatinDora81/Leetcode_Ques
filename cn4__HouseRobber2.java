import java.util.ArrayList;

public class cn4__HouseRobber2 {
    
public static void main(String[] args) {
        int arr[]={1,5,2};
        
        long ans=houseRobber(arr);
        System.out.println(ans);
    }
    
    public static long houseRobber(int[] valueInHouse) {
		if(valueInHouse.length==1) return valueInHouse[0];
		ArrayList<Integer> temp1=new ArrayList<>();
		ArrayList<Integer> temp2=new ArrayList<>();
		for(int i=0;i<valueInHouse.length;i++){
			if(i!=0) temp1.add(valueInHouse[i]);
			if(i!=valueInHouse.length-1) temp2.add(valueInHouse[i]);
		}

		return Math.max( maximumNonAdjacentSum(temp1) , maximumNonAdjacentSum(temp2) );
	}

	public static long maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        //lec 5 spac eoptimized code
		long prev1= nums.get(0);
		long prev2=0;
        
		for(int i=1;i<nums.size();i++){
			long pick= nums.get(i);
			if(i>1) pick+=prev2;
        	long notpick= 0 + prev1;

			long curri=Math.max(pick, notpick);
            prev2=prev1;
            prev1=curri;
		}  
        return prev1 ;
	}
}

