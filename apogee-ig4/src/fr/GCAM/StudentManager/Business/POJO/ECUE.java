/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.GCAM.StudentManager.Business.POJO;

import fr.GCAM.StudentManager.POJO.Business.Etudiant.AbstractEtudiant;
import fr.GCAM.StudentManager.POJO.Business.Etudiant.EtudiantECUE;
import java.util.ArrayList;

/**
 * Cette classe est un POJO(Plain Old Java Object), qui correspond à l'ensemble
 * des données nécessaires pour réaliser la maquette de l'ECUE.
 * L'ensemble de ses méthodes est donc composée uniquement d'accesseurs et de
 * mutateurs.
 *
 * @author pierre
 */
public class ECUE {

    private String codeMatiere;
    private String libelleECUE;
    private int nbHeures;
    private String responsable;
    private String codeUE;
    private ArrayList<EtudiantECUE> listeEtud = new ArrayList<EtudiantECUE>();

    public ECUE() {
    }

    public ECUE(String codeMatiere, String libelleECUE, String responsable, int nbHeures, ArrayList<EtudiantECUE> listeEtud) {
        this.codeMatiere = codeMatiere;
        this.libelleECUE = libelleECUE;
	this.responsable = responsable;
	this.nbHeures = nbHeures;
	this.listeEtud = listeEtud;
    }

    public boolean hasStudent(Integer i) {
        return (i > 0 && i <= listeEtud.size());
    }

    public String getCodeMatiere() {
	return codeMatiere;
    }

    public void setCodeMatiere(String codeMatiere) {
	this.codeMatiere = codeMatiere;
    }

    public String getCodeUE() {
	return codeUE;
    }

    public void setCodeUE(String codeUE) {
	this.codeUE = codeUE;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getPrenomResponsable() {
        return responsable.split(" ")[0];
    }

    public String getNomResponsable() {
        return responsable.split(" ")[1];
    }

    public String getLibelleECUE() {
	return libelleECUE;
    }

    public void setLibelleECUE(String libelleECUE) {
	this.libelleECUE = libelleECUE;
    }

    public int getNbHeures() {
	return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
	this.nbHeures = nbHeures;
    }

    public ArrayList<EtudiantECUE> getListeEtud() {
	return listeEtud;
    }

    public void setListeEtud(ArrayList<EtudiantECUE> listeEtud) {
	this.listeEtud = listeEtud;
    }

    @Override
    public String toString() {
        String str = "Code Matiere : " + this.getCodeMatiere() + "\n"
                + "Libelle ECUE : " + this.getLibelleECUE() + "\n"
                + "Responsable : " + this.getResponsable() + "\n"
                + "Code UE Parente : " + this.getCodeUE() + "\n"
                + "Nombre d'heures : " + this.getNbHeures() + "\n"
                + "Liste etudiants : \n";

        for(AbstractEtudiant e : this.getListeEtud()) {
            str += "\t" + e.toString();
        }
        return str;
    }

    public float getNote(int numEtudiant) {
	for (EtudiantECUE e: listeEtud) {
	    if (e.getNumEtudiant() == numEtudiant) {
		return e.getNoteSession1();
	    }
	}
	return 0;
    }
	
}