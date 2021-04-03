// function taking an array and length

public static int equilibriumPoint(long arr[], int n) {
        int i=0;
        int j=n-1;
        long lsum=arr[i];
        long rsum=arr[j];
        if(n==1){
            return 1;
        }
        else if(n==2){
            return -1;
        }
        else{
        while(j-i>1){
            if(lsum>rsum){
                j--;
                rsum+=arr[j];
            }
            else{
                i++;
                lsum+=arr[i];
            }
            if(lsum==rsum && (j-i==2)){
                return ((j+i)/2)+1;
            }
        }
        return -1;
        }
    }
