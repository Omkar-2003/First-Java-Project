package omkar.com;

import org.w3c.dom.ls.LSOutput;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static  String exit=""; static String exit1="Yes";

 static Scanner input= new Scanner(System.in);
  static   ArrayList < String>list=new ArrayList<>() ;

    public static void main(String[] args) {
        String s="";
        System.out.println("Do you want to add name \n 1]yes \n 2]No ");
        int response= input.nextInt();
        if(response==1) {
            System.out.println("Put Your Name=");
             s = input.next();
        }
        if(exit.equals(exit1)){
            return;
        }
        int k=0;
        Scanner input= new Scanner(System.in);
        //below names are already presented in data
        String a="Omkar";String b="Varun";String c="shahid";String d="Alia";String e="Ranveer";

        System.out.println("** If you add your name then it will be presesnt in our data **");
        System.out.println("Choose your name=");
        String f = input.next();

        while (k < 3) {
            if (exit.equals(exit1)){
                return;
            }
        if(f.equals(a)||f.equals(b)||f.equals(c)||f.equals(d)||f.equals(e)||f.equals(s)) {

                System.out.println("Choose one option ( press respective number which presented on left site):-");
                System.out.println("1] Educational books \n2] fictonal books");
                int g = input.nextInt();
                if (g == 1) {
                    String A = "Physics";
                    String B = "Maths";
                    String C = "Computer Network";
                    String D = "Autometa Theory";
                    String E = "DBMS";
                    String F = "Chemistry";

                    System.out.println("Press 1 for Physics\n Press 2 for Maths \n Press 3 for Computer Network \n Press 4 for Autometa Theory \n Press 5 for DBMS \n Press 6 for Chemistry ");
                    int h = input.nextInt();
                    if(h>6||h==0){
                        System.out.println("Wrong Option ,Choose Coorect one =");
                        h = input.nextInt();
                    }
                    Educational(h, f,k);
                    k++;

                } else if (g == 2) {
                    String A = "Harry Potter";
                    String B = "Think and Grow Rich";
                    String C = "Atomic Habits";
                    String D = "Achlemestic";
                    String E = "Lord Shiva";
                    String F = "The Subtle Art of Not Giving a F*ck";

                    System.out.println("Press 1 for Harry Potter\n Press 2 for Think and Grow Rich \n Press 3 for Atomic Habits \n Press 4 for Achlemestic \n Press 5 for Lord Shiva  \n Press 6 for The Subtle Art of Not Giving a F*ck ");
                    int h = input.nextInt();
                    while (h>6||h==0){
                        System.out.println("Wrong Option ,Choose Coorect one =");
                         h = input.nextInt();
                    }

                    Fictonal(h, f,k);
                    k++;

                } else {
                    System.out.println("Incorrect Option");
                }
            }
        else{
                System.out.println("This name is not Presented in our data !! Please put right name");
                main(args);
            }
        }

    }
    static void Educational(int p,String f,int k){

        switch (p){
                case 1 :
                System.out.println("Physics book is allocated to " +f);
                list.add("Physics");
                break;
                case 2 :
                System.out.println("Maths book is allocated to " +f);
                list.add("Maths");
                break;
                case 3:
                System.out.println("Computer Network book is allocated to " +f);
                    list.add("Computer Network");
                break;
                case 4 :
                System.out.println("Autometa Theory book is allocated to " +f);
                    list.add("Autometa Theory");
                break;
                case 5 :
                System.out.println("DBMS book is allocated to " +f);
                    list.add("DBMS");
                break;
                case 6:
                System.out.println("Chemistry book is allocated to " +f);
                    list.add("Chemistry");
                break;
            default:
                System.out.println("Wrong Option");



        }
        if(k==2){
            System.out.println("This is Maximum books You can take from library ");
            System.out.println("Below Books are Allocated to " +f );
            System.out.println(list);
            return;
        }
        else {
            System.out.println("You can still take " + (3 - (k+1)) + " Books !!! lucky you !!!!!");
        }
        System.out.println("Do  you  want to take More books \n 1]Yes \n 2]No  ");
        int j= input.nextInt();
        if(j==2){
            System.out.println("Below Books are Allocated to " +f );
            System.out.println(list);
            exit="Yes";


        }

    }
    static void Fictonal (int p, String f,int k){

        switch (p){
            case 1 :
                System.out.println("Harry Potter book is allocated to " +f);
                list.add("Harry Potter");
                break;
            case 2 :
                System.out.println("Think and Grow Rich book is allocated to " +f);
                list.add("Think and Grow Rich ");
                break;
            case 3:
                System.out.println("Atomic Habits book is allocated to " +f);
                list.add("Atomic Habits");
                break;
            case 4 :
                System.out.println("Achlemestic book is allocated to " +f);
                list.add("Achlemestic");
                break;
            case 5 :
                System.out.println("Lord Shiva book is allocated to " +f);
                list.add("Lord Shiva");
                break;
            case 6:
                System.out.println("The Subtle Art of Not Giving a F*ck book is allocated to " +f);
                list.add("The Subtle Art of Not Giving a F*ck");
                break;
            default:
                System.out.println("Wrong Option");

        }
        if(k==2){
            System.out.println("This is Maximum books You can take from library ");
            System.out.println("Books Allocated to " +f);

            System.out.println(list);
            return;
        }
        else {
            System.out.println("You can still take " + (3- (k+1)) + " Books !!! lucky you !!!!!");
        }
        System.out.println("Do  you  want to take More books \n 1]Yes \n 2]No  ");
        int j= input.nextInt();
        if(j==2){
            System.out.println("Books Allocated to " +f);
            System.out.println("Below Books are Allocated to " +f );
            System.out.println(list);
            exit="Yes";

        }
    }



}
