class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int[]fact=new int[n];
        fact[0]=1;
        for(int i=1;i<n;i++)
        fact[i]=fact[i-1]*i;
        String ans="";
        k--;//0-based indexing
        for(int i=n;i>0;i--){
            int ind=k/fact[i-1];
            ans+=arr.get(ind);
            arr.remove(ind);
            k%=fact[i-1];
        }
        return ans;

    }
}
