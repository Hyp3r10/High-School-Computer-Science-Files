public class TylerSolutionBouquet {
    public static void main(String[] args) {
    	System.out.println(minDays(new int[] {1,10,3,10,2}, 3, 1));
    }
	public static int minDays(int[] bloomDay, int m, int k) {
        if(((long)m)*k > bloomDay.length)
            return -1;
        int l = 0;
        int r = (int)Math.pow(10, 9);
        int mid = (l+r)/2;
        int count = 0;
        int bouq = 0;
        while(l <= r)
        {
        	
            count = 0;
            bouq = 0;
            mid = (l+r)/2;
            boolean check = false;
            for(int num : bloomDay)
            {
            	System.out.print(num + " ");
                if(num <= mid)
                {
                    count++;
                    if(count == k)
                    {
                        count = 0;
                        bouq++;
                    }
                }else
                {
                    count = 0;
                }
                if(bouq == m)
                {
                    check = true;
                    break;
                }
            }
            //System.out.println();
            if(check)
            {
                r = mid-1;
            }else
                l = mid+1;
        }
        return l;
    }
}