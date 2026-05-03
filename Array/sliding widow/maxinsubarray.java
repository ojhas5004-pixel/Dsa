import java.util.Deque;
import java.util.ArrayDeque;

  public class maxinsubarray {
     public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer>deque=new LinkedList<>();
        int res[]=new int[n-(k-1)];

        for(int i=0;i<n;i++){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty()&& nums[i]>nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.addLast(i);
            if(i>=k-1){
                res[i-k+1]=nums[deque.peekFirst()];
            }
        }
        return res;
     }
  }