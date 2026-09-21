class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l=1, r=*max_element(piles.begin(),piles.end());
        int res=r;

        while(l<=r){
            int m=(l+r)/2;

            long long k=0;

            for(int p:piles) k+=ceil(static_cast<double>(p)/m);

            if(k<=h){
                res=m;
                r=m-1;
            }
            else l=m+1;
        }
        return res;
    }
};
