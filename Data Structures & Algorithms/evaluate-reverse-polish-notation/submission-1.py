class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack=[]
        for i in tokens:
            if i in "+-*/":
                b=stack.pop()
                a=stack.pop()

                if i == "+":
                    res=int(a+b)
                elif i == "-":
                    res=int(a-b)
                elif i == "*":
                    res=int(a*b) 
                elif i == "/":
                    res=int(a/b)

                stack.append(res)

            else:
                stack.append(int(i))
        return stack[-1]  