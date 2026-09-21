class Solution:

    def encode(self, strs: List[str]) -> str:
        encodedRes=""

        for s in strs:
            if s ==" ":
                encodedRes+=" "
            encodedRes+=f"{s}%##%"
        return encodedRes

    def decode(self, s: str) -> List[str]:

        decodedRes=[]

        i=0
        j=0

        while j<=len(s):

            if s[j:j+4]=="%##%":
                decodedRes.append(s[i:j])
                j+=4
                i=j
            else:
                j+=1
        return decodedRes    