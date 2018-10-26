package com.nissan.trainingcorejava;
import java.util.Scanner;
interface book{
 abstract void add();
 abstract void remove();
 abstract void update();
 abstract void create();
}

//User interface
interface use{
 abstract void borrow();
 abstract void ret();
}

//Library class
class library{
 Scanner scanner =new Scanner(System.in);
 String[] books = new String[30];
 int[] count = new int[30];
 int i=0;
 void admin() {
 
 book a = new book() {
  public void add() {
   int f =0;
   String h;
   
   System.out.println("Enter name of the book :");
   
   h=scanner.next();
   for(int l =0;l<i;l++) {
    if(h==books[l]) {
     count[l]++;
     f=1;
     break;
    }
   }
  }
  
 //Removing book
  public void remove() {
   String h;
   int f=0;
   System.out.println("Enter name of the book :");
   h = scanner.next();
   for(int l=0;l<i;l++) {
    if(h==books[l]) {
     count[l]--;
     f=1;
     break;
    }
   }
   if(f!=1) {
    System.out.println("Book not found ");   
   }
  }
  
 //Updating book
  public void update() {
   String h;
   int f=0;
   System.out.println("Enter the name of the book to be removed :");
   h = scanner.next();
   for(int l =0;l<i;l++) {
    if(h==books[l]) {
     count[l]++;
     f=1;
     break;
    }
   }
   if(f!=1) {
    System.out.println("Book not found ");    
   }   
  }

  
  //Creating new book
  public void create() {
   for(int k=0;k<30;k++){
    count[k]=0;
   }
   int k;
   System.out.println("Enter Number of books enlisted in the library:");
   int n = scanner.nextInt();
   System.out.println("Enter the books and count of books.");
   for( k=0;k<n;k++) {
    books[k]=scanner.next();
    count[k]+=scanner.nextInt();    
   }
   i=n;  
  }
 };
 
 System.out.println("\t\t ADMINISTRATOR PORTAL\n1.Create Library Database\n2.Add Book\n3.Remove book\n4.Update\nEnter choice:");
 int c = scanner.nextInt();
 switch(c) {
 case 1: a.create();
  break;
 case 2:
   a.add();
   break;
 case 3:
   a.remove();
    break;
 case 4:
   a.update();
   break;
 default:
    System.out.println("Wrong choice");
    break;   
 }
 }
 
 void user() {
  
  use u= new use() {
   public void ret(){
    String h;
    int f=0;
    System.out.println("Enter the name of the book you wish to return:");
    h=scanner.next();
    for(int k=0;k<i;k++) {
     if(h==books[k]) {
      count[k]--;
      f=1;
      break;
     }
    }
    if(f!=1) {
     System.out.println("No book found ");
     
    }
    else {
     System.out.println("Book found");   
    }
   }
   
//Borrow book   
   public void borrow(){
    String h;
    int f=0;
    System.out.println("Enter book name:");
    h=scanner.next();
    for(int k=0;k<i;k++) {
     if(h==books[k]) {
      count[k]--;
      f=1;
      break;
     }
    }
    if(f!=1) {
     System.out.println("Book not found ");
    }
    else {
     System.out.println("Book found");
    }
   }
  };
  
   
  System.out.println("\t\t USER PORTAL\n1.Issue book\n2.Return book\nENter choice:");
  int c = scanner.nextInt();
  switch(c) {
  
  case 1:
    u.borrow();
    break;
  case 2:
    u.ret();
    break;
  }
  
 }
 
}
public class Library1 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int p =0;
  int pin =1234,pass;
  // TODO Auto-generated method stub
  library l =new library();
  do {
  System.out.println("\t\tMenu\n1.Admin\n2.User\nEnter your choice :");
  int ch = scanner.nextInt();
  switch(ch) {
  
  case 1:
   System.out.println("Please enter Admin pin:");
   pass =  scanner.nextInt();
   if(pass==pin) {
   l.admin();
   }
   else {
    System.out.println("Wrong pin. Exiting...");
    break;
   }
   break;
  case 2:
   l.user();
   break;
  default:
    System.out.println("Wrong choice");
    break;
  }
  System.out.println("Enter 1 to return to main menu");
  p=scanner.nextInt();
 }while(p==1);
 }
}

