class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0,j=0,k=0;
        int newA [] = new int [m+n];

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                newA[k++] = nums1[i++];
            }else{
                 newA[k++] = nums2[j++];
            }
        }
        while(i < m){
            newA[k++] = nums1[i++];
        }
         while(j < n){
             newA[k++] = nums2[j++];
         }

         for(int l = 0;l<newA.length;l++){
            nums1[l] = newA[l];
         }
    }
}