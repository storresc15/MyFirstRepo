public boolean modThree(int[] nums) {
  int countodd = 0;
  int counteven = 0;
  boolean even = false;
  
  for(int i = 0; i < nums.length; i++ ){
    
    if(counteven >= 3 || countodd >= 3) return true;
    
    if(nums[i] % 2 == 0 && even) {
      counteven++;
  }else if(nums[i] % 2 != 0 && !even){
    countodd++;
  }else if(nums[i] % 2 != 0){
    counteven = 0;
    even = false;
    countodd ++;
  } else if(nums[i] % 2 == 0){
    countodd = 0;
    even = true;
    counteven ++;
  }
    
  }
  return counteven == 3 || countodd == 3;
}
