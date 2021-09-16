
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itlabs
 */
public class NewClass16 {
    private boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0) return false;
        
        }
        return true;
    }
    
    int getPrimeSum(int[] nums){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(isPrime(nums[i])){
                sum+=nums[i];
            }
        }
        
        return 0;
        
    }
    int [] getArrayFromFile(String fl) throws FileNotFoundException{
      Scanner sc= new Scanner (new File(fl));
        while(sc.hasNext()){
            
        }
        int[] arr= new int[10];
        return arr;
        
    }
            
            
            
            
    public static void main(String[] args){
        NewClass16 nc= new NewClass16();
        int[] arr ={3,4,8,7,9,10,12,5};
        int sum=nc.getPrimeSum(arr);
        
        System.out.println("The sum of the prime in the array is "+ sum );
    
        
        
    }
}
