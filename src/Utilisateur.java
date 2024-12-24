import java.util.List;

public class Utilisateur extends  Personne{

    String email;
    String motdepasse;
    Role role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Utilisateur(String nom, int age , String email , String motdepasse) {
        super(nom, age);
        this.email=email;
        this.motdepasse=motdepasse;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom=" +nom+
                "age = " +age+
                "role=" + role +
                ", motdepasse='" + motdepasse + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
