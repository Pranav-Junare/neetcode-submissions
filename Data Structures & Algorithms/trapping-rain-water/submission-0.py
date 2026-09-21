class Solution:
    def trap(self, height: List[int]) -> int:
        l,r=0, len(height)-1
        res=0
        lm,rm=height[l], height[r]
        while l<r:
            if lm<=rm:
                l+=1
                lm=max(lm,height[l])
                res+=lm-height[l]
            else:
                r-=1
                rm=max(rm,height[r])
                res+=rm-height[r]
        return res