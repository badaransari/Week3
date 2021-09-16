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
    public static void main(String[] args){
        NewClass16 nc= new NewClass16();
        int x= 10;
        System.out.println("Number " +x+ "is" + (
        nc.isPrime(x)?"": "not a"
                )+ "prime" );
        
        
    }
}
