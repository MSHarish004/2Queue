/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zoho.longprog;
import java.util.*;
/**
 *
 * @author Saiharish M
 */
public class LongProg {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter capacity : ");
        int n1=sc.nextInt();
        Aonce a=new Aonce(n1);
        boolean loop=true;
        while(loop){
            System.out.println("Enter \n1.input \n2.Display \n3.Get \n4.exit");
            int n=sc.nextInt();
            switch(n){
                case 1: System.out.print("Enter the key: ");
                        int k=sc.nextInt();
                        System.out.print("Enter the value: ");
                        int v=sc.nextInt();
                        a.put(k,v,1);
                        break;
                case 2: a.display();
                        break;
                case 3: System.out.print("Enter the key to get the value: ");
                        int key=sc.nextInt();
                        System.out.println("Value: "+a.get(key));
                        break;
                case 4: System.out.println("Exiting....");
                        return;
            }
        }
        
    }
}
