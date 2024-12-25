import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Administration administration = new Administration();
        

        int choix;

        do {
            System.out.println("entrez 1 pour ajouter un utilisateur");
            System.out.println("entrez 2 pour afficher les utilisateur");
            System.out.println("entrez 3 pour  rechercher un utilisateur ");
            System.out.println("entrez 4 pour  modifier sur  un utilisateur");
            System.out.println("entrez 5 pour supprimer un utilisateur ");
            System.out.println("entrez 9 pour Quitter \n");


            choix = scan.nextInt();
            scan.nextLine();
            if (choix == 9) {
                System.out.println("au revoir");
                break;
            }


            switch (choix) {
                case 1:
                    System.out.println("entrez le nom d'utilisateur");
                    String nom = scan.nextLine();
                    System.out.println("entrez l'age d'utilisateur");
                    int  age = scan.nextInt();
                    System.out.println("entrez l'email d'utilisateur ");
                    String email = scan.next();
                    scan.nextLine();
                    System.out.println("entrez le mot de passe  ");
                    String psw = scan.nextLine();
                    System.out.println("entrez le role  ");
                    String rolename = scan.nextLine();
                    Role role = new Role(rolename);


                    administration.AjouterUser(new Utilisateur(nom,age,email,psw,role));


                    break;
                case 2:
                    administration.AfficherUser();
                    break;

                case 3 :
                    System.out.println("Rechercher   :  ");
                    String vall = scan.nextLine();

                    administration.RechercherUser(vall);

                    break;

                case 4:
                    System.out.println("entrez le nom d'utilisateur a modifié ");
                    String noommod = scan.nextLine();


                    System.out.println("qu'est ce que vous voulez modifier exactement  ");
                    System.out.println("entrez 1 pour modifier le nom ");
                    System.out.println("entrez 2 pour modifier le role ");
                    System.out.println("entrez 3 pour modifier l'email");
                    System.out.println("entrez 4 pour modifier le mot de passe ");
                    System.out.println("entrez 5 pour modifier l'age");


                    int choixmod = scan.nextInt();
                    scan.nextLine();

                    if(choixmod==1 || choixmod==2 || choixmod == 3 || choixmod == 4 ){
                        System.out.println("entrez la modification  :  ");
                        String nwtt = scan.nextLine();


                       administration.ModifierUser(noommod,nwtt,choixmod);

                    }else{
                        System.out.println("entrez la modification  :  ");
                        int nwage = scan.nextInt();

                        administration.ModifierUser(noommod,nwage,choixmod);

                    }


                    break;
                case 5 :
                    System.out.println("entrez le nom d'utilisateur a supprimer   :  ");
                    String nmsp = scan.nextLine();

                    administration.SupprimerUser(nmsp);

                    break;






                default:
                    System.out.println("choix indisponible");
                    break;


            }


        }while (choix!=0);





    }
}