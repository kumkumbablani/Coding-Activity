class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int swaps=0;
        for(int i=0;i<n;i+=2){
            int couple=row[i]%2==0 ? row[i]+1 : row[i]-1;
            if(row[i+1]!=couple){
                swaps++;
                for(int j=i+1;j<n;j++){
                    if(row[j]==couple){
                        row[j]=row[i+1];
                        row[i+1]=couple;
                        break;
                    }
                }
            }
        }
        return swaps;
    }
}