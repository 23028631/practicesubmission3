/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearch1;
import java.util.Scanner;

/**
 *
 * @author Laptop acer
 */
public class Linearsearch1 {

    
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int flag=0;
        int key;
        Scanner sc=new Scanner(System.in);
        key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
            flag=1;
            break;
        } 
        }
        if(flag==1){
            System.out.println("key found");
            }else{
            System.out.println("key not found");
        }
    }
    
}
