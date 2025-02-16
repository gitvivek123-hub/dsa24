class Solution {
    public boolean isHappy(int n) {
        
        if(n==1 || n==7) return true;
        else if(n<0) return false;
        else if(n>=2 && n<=6) return false;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum +=(r*r);
            n=n/10;
        }
        n=sum;
        return isHappy(n);
    }
}
    
