class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        # Since number excatly <1 than i, no repeats allowed
        numS=set(nums)

        # Since theres a possibility that the longest sequnce could be 0
        longest = 0

        # A for loop to iterate over the set, not the list
        for num in numS:
            # if num-1 does not exist, it means that a new seq starts
            if (num-1) not in numS:
                length=1
                while (num+length) in numS:
                    length+=1
                # Finding out the max a seq can be
                longest=max(length, longest)
        return longest