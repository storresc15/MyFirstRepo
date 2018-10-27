public int matchUp(int[] nums1, int[] nums2) {
  
  int count = 0;
  
  for(int i = 0; i < nums1.length; i ++){
    if(nums1[i] != nums2[i]){
      if(Math.abs(nums1[i] - nums2[i]) <= 2  || Math.abs(nums2[i] - nums1[i])<= 2 )count++;
    }
  }
  return count;
}
