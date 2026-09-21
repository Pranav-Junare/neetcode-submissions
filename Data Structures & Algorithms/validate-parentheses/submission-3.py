class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        count={"}":"{", "]": "[", ")":"("}
        for c in s:
            if c in count:
                if stack and stack[-1] == count[c]:
                    stack.pop()
                else: return False
            else: stack.append(c)
        return True if not stack else False