package myPack;

import java.util.Random;


public class Email {

    public String Email_Gen(Employe emp){

        return emp.getNom()+'.'+emp.getPrenom()+"@company.com";
    }

    public String Pass_Gen(){
        char tab[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                     'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                     '0','1','2','3','4','5','6','7','8','9'};
        Random rnd = new Random();
        String password ="";
        for (int i=0;i<8;i++){
            password = password + tab[rnd.nextInt(62)];
        }

        return password;
    }












}
