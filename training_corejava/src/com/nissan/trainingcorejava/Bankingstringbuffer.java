package com.nissan.trainingcorejava;
import java.util.Scanner;
import java.util.Random;

class User1{
 Scanner sc =new Scanner(System.in);
 
 int balance=0,FDbalance=0,currentbal=0,RDbalance=0,pin,log=0;
 StringBuffer name = new StringBuffer("");
 StringBuffer UID = new StringBuffer("");
 StringBuffer mail = new StringBuffer("");
 StringBuffer addr = new StringBuffer("");
 
 void  balance() {
  int ch,c=1;
  do {
  System.out.println("1.Savings \n2.Current\n3.Fixed\n4.RD\n Enter Choice:");
  switch(ch=sc.nextInt()) {
  case 1:
    System.out.println("Enter amount you wish to deposit:");
    balance+=sc.nextInt();
    if(balance<=10000) {
     System.out.println("Please deposit "+ (1000-balance) +" more to maintain minimum balanceance(1000)");
     continue;
    }
    System.out.println("Amount deposited Successfully. Available balanceance = "+ balance);
    break;
  case 2: 
   System.out.println("Enter amount you wish to deposit:");
   currentbal+=sc.nextInt();
   System.out.println("Amount deposited Successfully. Available balanceance = "+ currentbal);
   break;
  case 3:
   System.out.println("Enter amount you wish to deposit:");
   FDbalance+=sc.nextInt();
   System.out.println("Amount deposited Successfully. Available balanceance = "+ FDbalance);
   break;
  case 4:
   System.out.println("Enter amount you wish to deposit:");
   RDbalance+=sc.nextInt();
   System.out.println("Amount deposited Successfully. Available balanceance = "+ RDbalance);
   break;
  default:
    System.out.println("Wrong choice.");
    break;
  
  }
  System.out.println("Enter 1 to move back to Deposit Menu: ");
  c=sc.nextInt();
  }while(c==1);
 }
  void addUser() {
   Random r = new Random();
   System.out.println("Enter User name:");
   name.append(sc.next());
   System.out.println("Enter main ID:");
   mail.append(sc.next());
   System.out.println("Enter Address :");
   addr.append(sc.next());
   UID.append(name);
   pin = r.nextInt(10000);
   System.out.println("User ID generated :" + UID + "\nPIN :"+ pin +"\nYou are eligible for Savings,Currend,Fixed and RD accounts");
   this.balance();
   
  }
  
  void edit() {
   int ch,p,c;
   do {
   System.out.println("1.Edit user name \n2.Change pin\nEnter choice :");
   switch(ch=sc.nextInt()) {
   
   case 1:
     System.out.println("Enter Last name");
     name.append(" "+sc.next());
     break;
   case 2:
     System.out.println("Enter old pin :");
     p=sc.nextInt();
     if(p==pin) {
      System.out.println("Enter new pin:");
      pin=sc.nextInt();
     }
     else {
      System.out.println("Invalid pin");
     }
     break;
   default:
     System.out.println("Wrong choice.");
     break;
     
   }
   System.out.println("Enter 1 to goto edit menu");
   c=sc.nextInt();
   }while(c==1);
  }
  
  void modUser(User1 u[]){
   
    log++;
    balance-=100;
    RDbalance+=100;
    System.out.println("User found. \nSign in number :"+log+"\nRs.100 has been transferred from Savings to RD account.\nSavings balanceance= "+balance+"\nRD balanceance ="+ RDbalance);
    this.edit();
    this.balance();
      
  }
 
}
public class Bankingstringbuffer {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc =new Scanner(System.in);
  User1[] u =new User1[30];
  int c,ch,i=0;
  do {
  System.out.println("\t\t Main Menu \n\n 1.Sign in \n 2.Sign up \n Enter Choice :");
  ch = sc.nextInt();
  switch(ch) {
  
  case 1:
    if(i==0) {
     System.out.println("User database empty.Please sign up first.");
     break;
    }
     StringBuffer nam = new StringBuffer("");
     int p,f=0,k;
     System.out.println("Enter User name and Pin :");
     nam.append(sc.next());
     p=sc.nextInt();
     System.out.println(nam);
     System.out.println(p);
     for(k=0;k<i;k++) {
      System.out.println(u[k].name);
      if(nam.toString().equals(u[k].name.toString())) {
       
       f=1;
       break;
      }
     }
     if(f!=1) {
      System.out.println("Invalid userID or pin");
      
     }
     else {
      
     u[--k].modUser(u);
     }
    break;
    
  case 2:
    u[i] = new User1();
    u[i++].addUser();
    break;
    
  }
  
  System.out.println("Press 1 to continue :");
  c=sc.nextInt();
  }while(c==1);
 }
}