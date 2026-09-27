class Solution {
    public int hardestWorker(int n, int[][] logs) {

        int res=0;

        int[]empTime=new int[n];
        int prevTime=0;
        int empId=0;
        int empTimeWorked=0;
        
        for(int[] empDetails:logs){
            empId=empDetails[0];
            empTimeWorked=empDetails[1]-prevTime;
            prevTime=empDetails[1];
            empTime[empId]=Math.max(empTime[empId],empTimeWorked);

            if(empTime[empId]>empTime[res] || empTime[empId]==empTime[res] && empId<res)res=empId;
        }
        // for(int i=0;i<empTime.length;i++){
        //     if(empTime[i]>empTime[res])res=i;
        // }
        return res;

    }
}