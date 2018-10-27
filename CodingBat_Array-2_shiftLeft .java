public int[] shiftLeft(int[] nums) {
  int len = nums.length;
  int[] newnums = new int[len];
  
  if(len < 2) return nums;
  
  for(int i = 0; i < len - 1; i++){
    newnums[i] = nums[i+1];
  }
  newnums[len-1] = nums[0];
  
  return newnums;
}
