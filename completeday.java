public class completeday {
    
}
class Solution {
    public int countCompleteDayPairs(int[] hours) {
         int count=0;
        for(int i=0;i<hours.length;i++)
        {
           
            for(int j=i+1;j<hours.length;j++)
            {
                int save = hours[i]+hours[j];
                if(save%24 == 0)
                {
                    count++;
                }
                
            }
        }
        return count;
        
    }
}