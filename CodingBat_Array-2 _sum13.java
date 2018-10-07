public int sum13(int[] nums) {
  int len = nums.length;
  int count = 0;
  
  if(len == 0) return 0;
  
  for(int i = 0; i < len; i++){
    if(nums[i] == 13){
      continue;
    }else if(i > 0 && nums[i - 1] == 13) continue;
    else count = count + nums[i];
  }
  return count;
}
