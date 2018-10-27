public boolean either24(int[] nums) {
  boolean or2 = false;
  boolean or4 = false;
  for(int i = 0; i <= nums.length - 2; i++){
    if(nums[i] == 2 && nums[i + 1] == 2) or2 = true;
    if(nums[i] == 4 && nums[i + 1] == 4) or4 = true;
  }
  if(or2 && or4) return false;
  if(or2 || or4) return true;
  return false;
}
