/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>>res=new ArrayList<>();

        int l=1;int r=z;
        while(l<=z && r>=1){
            if(customfunction.f(l,r)<z)l++;
            else if(customfunction.f(l,r)>z)r--;
            else{ res.add( List.of(l,r));
            l++;r--;}
        }
        return res;
    }
}