class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        arr=[]
        for i in range(1,n+1):
            arr.append(i)
        fact=[0]*n
        fact[0]=1
        for i in range(1,n):
            fact[i]=fact[i-1]*i
        k-=1
        res=""
        for i in range(n,0,-1):
            ind=k//fact[i-1]
            res+=str(arr[ind])
            arr.pop(ind)
            k%=fact[i-1]
        return res



        
