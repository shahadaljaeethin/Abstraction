package Abstract;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args){
//--------Create objects for Q1-------------------------------------------------------------
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Movie("Molan",37,"Disney"));
    products.add(new Movie("Sam",10,"mas"));
    products.add(new Movie("Valorant",100,"RIOT"));
    products.add(new Book("Atomic habits",60,"Dr.Sonya"));
    products.add(new Book("Think better",36,"Dr.mohammd"));
    products.add(new Book("learn English",40,"Dr.dalia"));
//--------Create object for Q2-------------------------------------------------------------
    MoveablePoint m = new MoveablePoint(0,0,2,3);
//=========================================================================================
int choice=0;
Scanner r = new Scanner(System.in);
while(choice!=3) {
try{
System.out.println("choose:\n# Question (1)\n# Question (2)\n leave (3)");
choice = r.nextInt();
if(choice==1){
    for (Product p : products) {
        System.out.println(p.toString());
        System.out.println("#after discount: " + p.getDiscount() + "\n_________________________");
    }}

if(choice==2){ m.showMenu();
}
}catch (Exception e){}}
}
}
