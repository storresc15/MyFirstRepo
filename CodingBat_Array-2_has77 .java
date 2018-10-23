public boolean has77(int[] nums) {
  boolean result = false;

  for (int i = 0; i < nums.length-1; i++)
  if ((nums[i] == 7 && nums[i+1] == 7))
  result = true;
  
   for (int i = 0; i < nums.length-2; i++)
  if ((nums[i] == 7 && nums[i+2] == 7))
  result = true;

  return result;
}
