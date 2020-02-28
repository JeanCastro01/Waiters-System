/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waiterorders;


import intems.dessert;
import intems.maincourse;
import intems.drinks;
import intems.intem;
import java.util.Scanner;

/**
 *
 * @author jeancastro
 */
public class Waiterorders {

        intem[] mainmenu ;
        intem[] mydessert ;
        intem[]   mydrinks;
        
        Scanner myScanner = new Scanner(System.in);
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        new Waiterorders();
   
        
    }
    
    public Waiterorders(){
       
        creatmenu();
         takeOrder();
     
    }
    
    public void creatmenu() {
        
         mainmenu = new maincourse[4];
         mydessert = new dessert[5];
         mydrinks = new drinks[5];
        
         
         mainmenu[0] = new maincourse("Pasta", 10);
         mainmenu[1] = new maincourse("Pizza", 8);
         mainmenu[2] = new maincourse("Steak", 15);
         mainmenu[3] = new maincourse("Salmon", 11);
         
         
        mydessert[0] = new dessert ("Tiramusu", 6);
        mydessert[1] = new dessert ("Brownies", 6);
        mydessert[2] = new dessert ("Ice cream", 7);
        mydessert[3] = new dessert ("Lemon Tart", 7);
     
        mydrinks[0] = new drinks("irish coffe", 8);
        mydrinks[1] = new drinks("Guinnes", 6);
        mydrinks[2] = new drinks("coke", 4);
        mydrinks[3] = new drinks("wine", 8);
        
    }
    
    
    public void takeOrder() {
        
        System.out.println("What would you like to order? 1- Main Course, 2 - Dessert, 3 - Drinks");


              int type = myScanner.nextInt();
              
              if (type == 1) {
                  
                  displaymenu(mainmenu);
              }
                  else if (type == 2) {
                  displaymenu(mydessert);
                          
                  }
                          else if (type == 3) {
                          
                          
                  displaymenu(mydrinks);
                  
              }
              
        
    }
    
    public void displaymenu(intem[] menu) {
        
        for ( int i = 0; i < menu.length; i++) {
            
            System.out.println(menu[i]);
        }
        
        
    }
}
