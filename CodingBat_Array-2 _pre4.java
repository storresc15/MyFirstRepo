public int[] pre4(int[] nums) {
  int loc = 0;
  boolean fr = false;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 4 && !fr) {
      loc = i;
      fr = true;
    } 
  }
  int[] newarr = new int[loc];
  
  for(int i1 = 0; i1 < loc; i1++){
    newarr[i1] = nums[i1]; 
  }
  
  return newarr;
  
}
