import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Intervenant extends User{
    IntervenantType type;
    int Identifiant;
    @Nullable
    List<Projet> projets;
    @Nullable
    List<Candidature> candidatures;

    public int getIdentifiant() {
        return Identifiant;
    }

    public void setIdentifiant(int identifiant) {
        Identifiant = identifiant;
    }

    public Intervenant(String Nom, String AdresseCourriel, String MotDePasse, IntervenantType Type, int Identifiant){
        this.nom = Nom;
        this.courriel = AdresseCourriel;
        this.password = MotDePasse;
        this.type = Type;
        this.Identifiant = Identifiant;
    }

    public void addProjet( Projet projet) {
        List<Projet> projets = this.projets;
        projets.add(projet);
        this.projets = projets;
    }

    public void addCandicature( Candidature candidature) {
        List<Candidature> candidatures = this.candidatures;
        candidatures.add(candidature);
        this.candidatures = candidatures;
    }

    public void removeCandicature(Candidature candidature){
        this.candidatures.remove(candidature);
    }
    public List<Candidature> getCandidatures() {
        return candidatures;
    }


}
