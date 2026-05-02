class Solution {
    public void reverseString(char[] s) {
        // int size = s.length, k = 0;
        // char temp[] = new char[size];
        // for(int i = size-1 ; i >= 0 ; i--){
        //     temp[k++] = s[i];
        // }
        // k = 0;
        // for(int i = size-1 ; i >= 0 ; i--){
        //     s[k++] = temp[i];
        // }
        // for(int i = 0 ; i < size ; i++){
        //     System.out.print(s[i]);
        // }
        int left = 0, right = s.length - 1;
    
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
    }
}