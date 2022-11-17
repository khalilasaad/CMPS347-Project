/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication017.ds.project;

/**
 *
 * @author khalil
 */
public class BubbleSort {
    public void Sort(String[] brand,String[] model,String[] category,String[] year,String[] price,int n){
    for(int j=0;j<n;j++){
         for(int i=0;i<n;i++){
             if(brand[j].compareTo(brand[i])>0){
                 String brandTemp,modelTemp,yearTemp,priceTemp,categoryTemp;
                 brandTemp=brand[j];
                 brand[j]=brand[i];
                 brand[j]=brandTemp;
                 
                 modelTemp=model[j];
                 model[j]=model[i];
                 model[i]=modelTemp;
                 
                 yearTemp=year[j];
                 year[j]=year[i];
                 year[i]=yearTemp;
                 
                 priceTemp=price[j];
                 price[j]=price[i];
                price[i]=priceTemp;
                
                
                 categoryTemp=category[j];
                 category[j]=category[i];
                category[i]=categoryTemp;
                 
         }
         }
    }
    }
    
}
