package lab3;

import java.util.Scanner;
public class Lab03_Q3_Revision {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String customers = "PrimeTech, Peak, EcoGoods,";
        String items = "Item104:Laptop Item125:Monitor";
        String itemIDList = "104 125";
        System.out.print("Enter your username: ");
        String userName = I.nextLine();
        if(!userName.equals("manager"))
        {
            System.out.println("Username not found! Goodbye!");
        }
        else
        {
            System.out.print("Enter your password: ");
            String password = I.nextLine();
            if(!password.equals("inventory"))
            {
                System.out.println("Incorrect password! Goodbye!");
            }
            else
            {
                System.out.print("\n1- Add customer \n2- Delete customer \n3- Add item \n4- Delete item \n5- Change credentials \n6- Logout \nSelect an operation:");
                
                int operation = I.nextInt();
                if(operation == 1)
                {
                    System.out.println("-- Add Customer --");
                    System.out.print("Enter customer name: ");
                    String addCustomer = sc.nextLine();
                    if(customers.contains(addCustomer))
                    {
                        System.out.println("This customer is already in your list! \nYour customers: (PrimeTech, Peak, EcoGoods, )");
                                                         
                    }
                    else
                    {
                        System.out.println("New customer " + addCustomer + " is added! \nYour customers: (" + customers + addCustomer + " )");
                    }
                        
                    
                    
                }
                else if(operation == 2)
                {
                    System.out.println("-- Delete Customer --");
                    System.out.print("Enter customer name which you want to delete: ");
                    String deleteCustomer = sc.nextLine();
                    if(customers.contains(deleteCustomer))
                    {
                        String modifiedDeleteCustomer = deleteCustomer.concat(",");
                        String newCustomersList = customers.replace(modifiedDeleteCustomer, "");
                        
                        System.out.println( deleteCustomer + " is deleted successfully from customers! \nYour customers: ( " + newCustomersList + ")");
                    }
                    else
                    {
                        System.out.println("You don't have any customer whose name is \n" + deleteCustomer + "!" + "\nYour customers: (PrimeTech, Peak, EcoGoods, )");
                    }
                }
                else if(operation == 3)
                {
                    System.out.println("-- Add Item --");
                    System.out.print("Enter item name: ");
                    String addItem = sc.nextLine();
                    int itemIDnumber = (int)(Math.random()*500);
                    String itemID = String.valueOf(itemIDnumber);
                    if(itemIDList.contains(itemID))
                    {
                        System.out.println("There is an item with the id " + itemID + ", you cannot add a new item with the same id!");
                        System.out.println("Your items: " + items);
                    }
                    else
                    {
                        System.out.println("New item with id " + itemID + " is added!");
                        System.out.println("Your items: " + items + " Item:" + itemID + ":" + addItem );
                    }
                }
                else if(operation == 4)
                {
                    System.out.println("-- Delete Item --");
                    if(items.length() == 0)
                    {
                        System.out.println("You don't have any items! \nYour Items: " + items);
                    }
                    else
                    {
                    System.out.print("Enter item Id which you want to delete: ");
                    String deleteItemID = sc.nextLine();
                    if(itemIDList.contains(deleteItemID))
                    { 
                        System.out.println("The item with the id " + deleteItemID + " is deleted successfully!");
                        if(deleteItemID.equals("125"))
                        {
                            System.out.println("Your items: Item104:Laptop");
                        }
                        else
                        {
                            System.out.println("Your items: Item125:Monitor");
                        }
                       
                    }
                    else
                    {
                        System.out.println("You don't have any item with the id " + deleteItemID + " !");
                        System.out.println("Your items: " + items);
                    }
                }
            }
                else if(operation == 6)
                {
                    System.out.println("Logged out successfully!");
                }
                else if (operation == 5)
                {
                    System.out.println("-- Change Credentials--");
                    System.out.println("1- Change username \n2- Change password");
                    System.out.print("Select an option: ");
                    int secondOption =sc.nextInt();
                    if(secondOption== 1)
                    {
                        System.out.println("Enter your new username: ");
                        String newUserName = in.nextLine();
                        System.out.println("Your username is " + newUserName);
                    }
                    else if(secondOption == 2)
                    {
                        System.out.println("Enter your new password: ");
                        String newPassword = in.nextLine();
                        System.out.println("Your password is " + newPassword);
                    }
                }
                    
                }
            }
            }   
        }
    
    
    

