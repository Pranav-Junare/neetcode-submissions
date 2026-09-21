class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        '''for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i]+nums[j]==target: return [i, j]
        return []'''

        hm={}

        for index, val in enumerate(nums):
            diff=target-val
            if diff in hm: return [hm[diff], index]
            hm[val]=index
