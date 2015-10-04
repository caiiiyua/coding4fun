public class Solution {
    private int[][] mArray; 
    private int[] mArrayInner;
    public boolean Find(int [][] array,int target) {
        mArray = array;
        for (int i = 0; i < mArray.length; i++) {
            if (findInner(mArray[i], target)) {
                return true;
            }
        }
        return false;
    }

    private boolean findInner(int [] array, int target) {
        mArrayInner = array;
        if (array.length <= 0) {
            return false;
        }
        return binarySearchInner(0, mArrayInner.length - 1, target);
    }

    private boolean binarySearchInner(int start, int end, int target) {
        int mid = (end - start) / 2 + start;
        if (mid == start) {
            return (mArrayInner[start] == target) || (mArrayInner[end] == target);
        }
        if (mArrayInner[mid] > target) {
            return binarySearchInner(start, mid, target);
        } else if (mArrayInner[mid] < target) {
            return binarySearchInner(mid, end, target);
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println("Test");
        int [][] a = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };
        int [][] b = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int [][] c = {{}};
        Solution s = new Solution();
        int target = 5;
        boolean r = s.Find(a, target);
        System.out.println("a: " + (r ? "Find " : "Do not find ") + target);
        target = 1;
        r = s.Find(b, target);
        System.out.println("b: " + (r ? "Find " : "Do not find ") + target);
        
        target = 16;
        r = s.Find(c, target);
        System.out.println("c: " + (r ? "Find " : "Do not find ") + target);
    }

    private boolean binarySearch(int start, int end, int target) {
        int newEnd = (end - start) / 2 + start;
        if (mArray[newEnd][0] > target) {
            for (int i = 0; i < newEnd; i++) {
                return findInner(mArray[i], target);
            }
            return binarySearch(start, newEnd, target);
        }
        return binarySearch(newEnd + 1, end, target);
    }
}