/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeunsortedlist;

import java.util.Arrays;

/**
 *
 * @author mahith
 */
public class MergeUnsortedList {

    /**
     * @param args the command line arguments
     */
    
    public static void merge(){
    
        int a[]={12, 2,-1,2, 45, 65};
        int b[]={48, 15, 4, 36, 19, 78, 1};
        int y=a.length+b.length;
        int[] c=new int[y];
        int i=0,j=0,k=0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<a.length && j<b.length){
           
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;i++; 
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
        }    
        while(i<a.length){
            //System.out.print("reached");
            c[k]=a[i];
            k++;i++;
        }    
        while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
                
        }
           
    for(int x=0;x<c.length;x++){
    
         System.out.print(c[x]+ " ");
    }    
    
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         merge();
    }
    
}
