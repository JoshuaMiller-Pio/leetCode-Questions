public class twosum {
  
        
        public static void main(String[] args) 
        {
            populate();
        }
            public static int[] TwoSum(int[] nums, int target)
            {
                int a;
                a = 0;
                
                int[] answer = new int[2];
                for (int i = 0; i < nums.length ; i++)
                {
                   
                    for (int f = 0; f < nums.length ; f++)
                    {
                        if (nums[i] != nums[f]) 
                        {
                        
                            a = nums[i] + nums[f];
                        
    
                            if (a == target)
                            {
                                answer[0] = i;
                                answer[1] = f;
                                System.out.println(answer[0] + " " + answer[1]);
                                
                                return answer;
                            }
                        } 
                    }
                }
                return null;
               
            }
    
            public static void populate()
            {
                int[] nums = { 10,10,40,12,8 };
                int target = 20;
                TwoSum(nums, target);
            }
            
        }
    
    
