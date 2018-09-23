package myPack;

import java.util.Scanner;

public class MClass {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Creation du l'employee
        Employe emp1 = new Employe();
        System.out.println("Entrer votre Nom svp : ");
        emp1.setNom(sc.next());
        System.out.println("Entrer votre Prenom svp : ");
        emp1.setPrenom(sc.next());

        //setting Employee Mail and password
        Email mail1= new Email();
        emp1.setEmail(mail1.Email_Gen(emp1));
        emp1.setPassword(mail1.Pass_Gen());

        System.out.println("Voulez vous entrez votre Email Alternative ? \n1 pour Oui \n2 pour non ");
        int Answer=sc.nextInt();
        boolean State_Of_Answer;
        while(Answer != 1 && Answer!=2){
            System.out.println("Entrer une valeur valide svp : ");
            Answer = sc.nextInt();
        }
        if(Answer==1){
            State_Of_Answer=true;
        }else {
            State_Of_Answer=false;
        }
        if(State_Of_Answer==true){
            System.out.println("Entrer votre Adresse Alternative : ");
            emp1.setEmail_alt(sc.next());
            System.out.println("Adresse Alternative Enregistré ");
        }
        System.out.println("Votre Adresse mail est : "+emp1.getEmail()+"\nVotre mot de passe : "+emp1.getPassword());

    }
}
