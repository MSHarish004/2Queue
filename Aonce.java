/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Saiharish M
 */
package zoho.longprog;
import java.util.*;
public class Aonce {
    private int key;
    private int value;
    private int capacity;
    private int size=0;
    int size2=0;
    private List<Node> list=new ArrayList<>();
    private List<Node> listMany=new ArrayList<>();
    private List<Integer> data=new ArrayList<>();
    private List<Integer> data2=new ArrayList<>();
    //int key,int value,
    Aonce(int capacity){
        this.capacity=capacity;
    }
    public void put(int key,int value,int freq){
        
        if(data.contains(key)){
            if(!data2.contains(key)){
                if(capacity==size2){
                    listMany.remove(0);
                    data.remove(0);
                    size2--;
                 }
                System.out.println("push to Amany");
                shift(key,value,freq);
                data2.add(key);
                del(key);
                size--;
                System.out.printf("size"+size);
            }
            else{
                popAndPush(key,value);
            }
            
        }
        else if(capacity==getSize()){
            list.remove(0);
            data.remove(0);
            list.add(new Node(key,value,freq));
            data.add(key);
        }
        
        else{
            list.add(new Node(key,value,freq));
            data.add(key);
            size++;
        }
        //return null;
        
    }
    public int get(int key){
        for(Node n:list){
            if(n.getKey()==key) 
                return n.getValue();
        }
        for(Node n:listMany){
            if(n.getKey()==key) return n.getValue();
        }
        return -1;
    }
    public int getSize(){
        return size;
    }
    //FOR AONCE
    public void shift(int key,int value,int freq){
        listMany.add(new Node(key,value,freq+1));   
        size2++;
    }
    public void del(int key){
        for(Node n:list){
            if(n.getKey()==key){
                list.remove(n);   
                break;
            }
        }
        
    }
    //FOR AMANY
    public  void popAndPush(int key,int value){
        for(Node n:listMany){
            if(n.getKey()==key){
                listMany.add(new Node(key,value,n.getFreq()+1));
                listMany.remove(n);
                break;
            }
        }
        
        
    }
    //display
    public void display(){
        System.out.println("Aonce");
        for(Node n:list){
            System.out.println("key:"+n.getKey()+" "+"Value:"+n.getValue()+" frq: "+n.getFreq());
        }
        System.out.println("Amany");
        for(Node n:listMany){
            System.out.println("key:"+n.getKey()+" "+"Value:"+n.getValue()+" frq: "+n.getFreq());
        }
    }
    
}






