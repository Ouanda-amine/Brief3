import java.util.ArrayList;
import java.util.List;

public class Administration {

    List<Utilisateur> users = new ArrayList<>();


    public void AjouterUser(Utilisateur Newutilisateur){
        users.add(Newutilisateur);
        System.out.println("Utilisateur ajouté");
    }

    public void AfficherUser(){
        users.forEach(System.out::println);
    }

    public void RechercherUser (String lenom){
        users.stream().filter(utilisateur -> lenom.equals(utilisateur.nom))
                .forEach(System.out::println);
    }

    public void ModifierUser(String nommod , String modification , int choixx){
        users.stream().filter(utilisateur -> nommod.equals(utilisateur.nom))
                .forEach(utilisateur -> {
                    switch (choixx){
                        case 1 :
                            utilisateur.setNom(modification);
                            break;
                        case 2 :
                            utilisateur.role.setRolename(modification);
                            break;
                        case  3 :
                            utilisateur.setEmail(modification);
                            break;
                        case 4 :
                            utilisateur.setMotdepasse(modification);
                            break;

                        default:
                            System.out.println("choix invalide !");
                            break;
                    }
                });

    }
    public void ModifierUser(String nommm , int  agemod , int choixx){
        users.stream().filter(utilisateur -> nommm.equals(utilisateur.nom))
                .forEach(utilisateur -> {
                    if(choixx == 5){
                        utilisateur.setAge(agemod);
                    }
                });
    }

    public void SupprimerUser(String nomsup){
        users.removeIf(utilisateur -> nomsup.equals(utilisateur.nom));
    }



}
