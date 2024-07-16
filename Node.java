/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package zoho.longprog;

/**
 *
 * @author Saiharish M
 */
public class Node {
    private int key;
    private int value;
    private int freq;
    Node(int key,int value,int freq){
        this.freq=freq;
        this.key=key;
        this.value=value;
    }
    public void putValue(int value){
        this.value=value;
    }
    public void putFreq(int freq){
        this.freq=freq;
    }
    public int getValue(){
        return value;
    }
    public int getFreq(){
        return freq;
    }
    public int getKey(){
        return key;
    }
}
