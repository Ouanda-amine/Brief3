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




}
