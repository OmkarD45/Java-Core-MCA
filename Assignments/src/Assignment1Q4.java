//  4.Write a Java Program for Menu driven program for a restaurant. Calculate the bill for the item purchased. Display menu with price. Welcome to Rohit Café Menu 1. Pizza- 400 Rs 2. Sandwich - 200 Rs 3. Coffee - 50 Rs 4. Burger - 100 Rs Enter code for the dish 1 How many Pizza you want to order: 4 Do you want to have anything else: No
//  Bill Item Quantity Price Amount Pizza 5 400 2000


import java.util.Scanner;
public class Assignment1Q4 {
    static Scanner sc = new Scanner(System.in);
    static int OrderList[] = new int[5];
    static int i = -1;
    static int Total = 0;
    static int Count= 0;
    static void GetOrder(){
        Count++;
        System.out.println("\n || Welcome To The Restaurant ||");
        System.out.println("\nPlease Choose your Food \n");
        System.out.print("Press 1 For Burger :=> 100/- \nPress 2 For Pizza :=> 400/- \nPress 3 For Sandwich :=> 200/-\n Press 4 For Coffee :=> 50/-\n ");
        int OrderChoice = sc.nextInt();
        if(OrderChoice >= 1 && OrderChoice <= 4){
            i+=1;
            OrderList[i] = OrderChoice;
            System.out.print("\nAnything else..? \nif Yes Press 'y' if No press 'n' \n\n ");
            char Extra = sc.next().charAt(0);
            if(Extra == 'y' || Extra == 'Y'){ // why we need to get only single quotes here
                GetOrder();
            }else{
                Bill();
            }
        }
    }
    static void Bill(){
        System.out.println("\n============ Your Bill ============\n");
        for(int i=0; i<Count; i++){
            switch(OrderList[i]){
                case 1 : System.out.println("Burger \t\t : 100 ");
                    Total = Total + 100;
                    break;
                case 2 : System.out.println("Pizza \t\t : 400 ");
                    Total = Total + 400;
                    break;
                case 3 : System.out.println("Sandwitch \t : 200 ");
                    Total = Total + 200;
                    break;
                case 4 : System.out.println("Coffee \t : 50 ");
                    Total = Total + 50;
                    break;
            }
        }
        System.out.print("-----------------------\nTotal \t\t : " + Total);
    }
    public static void main(String args[]){
        GetOrder();
    }
}
