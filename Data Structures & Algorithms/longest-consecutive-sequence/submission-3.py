class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numS=set(nums)
        longest=0

        for num in numS:
            if (num-1)  not in numS:
                length=1
                while (num+length) in numS: 
                    length+=1
                longest=max(length,longest)
        return longest