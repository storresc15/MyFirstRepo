public int[] tenRun(int[] nums) {
  boolean mul10 = false;
  int mul = 0;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 10 == 0){
      mul10 = true;
      mul = nums[i];
    }
    if(mul10) {
      nums[i] = mul;
    }
    
  }
  return nums;
}
