class Solution {
    public void sortColors(int[] nums) {
        int low = 0,mid=0;
        int high = nums.length-1;

       while(mid<=high) { 

        //  Dutch National flag Algorithm

            switch ( nums[mid] ){ 
                case 0 -> { 
                    int temp = nums[mid];
                    nums[mid++] = nums[low];
                    nums[low++] = temp;
                }
                case 1 -> {
                    int temp = nums[mid];
                    nums[mid++] = nums[low];
                    nums[low] = temp;
                }
                case 2 -> { 
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high--] = temp;

                }
                
            }


        }

   

        
        }
        
    }
