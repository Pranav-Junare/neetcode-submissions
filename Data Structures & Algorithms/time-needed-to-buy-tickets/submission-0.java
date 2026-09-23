class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res=0;
        while(true){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]>0){
                    tickets[i]--;
                    res++;
                    if(i==k && tickets[k]==0) return res;
                }
                
            }
        }
    }
}