package com.alphacoder;

public class PerfectSquareUtil {
    public boolean isPerfectSquare(int number){
        double squareRoot= Math.sqrt(number);
        if(number > 0 && squareRoot- Math.floor(squareRoot)== 0){
            return true;
        }
        return false;
    }

    public boolean isPerfectSquare1(int number){
        int i=1;

        while(i*i<=number){
            if(i*i== number){
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean isPerfectSquareBinary(int number){
        int left=1;
        int right= number;

        while(left<= right){
            int mid= (left+right)/2;
            if(mid*mid== number){
                return true;
            }
            if(mid*mid< number){
                left= mid+1;
            }
            if(mid*mid> number){
                right= mid-1;
            }
        }
        return false;
    }
}
