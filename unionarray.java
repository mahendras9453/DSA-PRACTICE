// struver a2z problem unionof the array
import java.util.*;
class unionarray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> unionSet = new HashSet<>();
        for (int num : nums1) {
            unionSet.add(num);
        }
        for (int num : nums2) {
            unionSet.add(num);
        }
        int[] unionArray = new int[unionSet.size()];
        int i = 0;
        for (int num : unionSet) {
            unionArray[i++] = num;

        }

          return unionArray;
    }
}