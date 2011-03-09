/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.util.ArrayList;

/**
 *
 * @author Quentin
 */
public class ECUE {

    private String codeMatiere;
    private String libelleECUE;
    private int nbHeures;
    private int idEnseignant;
    private String codeUE;
    private ArrayList<EtudiantECUE> listeEtud;

    public ECUE() {
    }

    public static class EtudiantECUE {

	public EtudiantECUE() {

	}

	public EtudiantECUE(int numEtud, String nom, String prenom, float noteSession1, float noteSession2) {
	    this.numEtud = numEtud;
	    this.nom = nom;
	    this.prenom = prenom;
	    this.noteSession1 = noteSession1;
	    this.noteSession2 = noteSession2;
	}

	private int numEtud;
	private String nom;
	private String prenom;
	private float noteSession1;
	private float noteSession2;

	public String getNom() {
	    return nom;
	}

	public float getNote1() {
	    return noteSession1;
	}

	public void setNote1(float note1) {
	    this.noteSession1 = note1;
	}

	public float getNote2() {
	    return noteSession2;
	}

	public void setNote2(float note2) {
	    this.noteSession2 = note2;
	}

	public int getNumEtud() {
	    return numEtud;
	}

	public String getPrenom() {
	    return prenom;
	}
    }

    public ECUE(String codeMatiere, String libelleECUE, int nbHeures, int idEnseignant, String codeUE, ArrayList<EtudiantECUE> listeEtud) {
	this.codeMatiere = codeMatiere;
	this.libelleECUE = libelleECUE;
	this.nbHeures = nbHeures;
	this.idEnseignant = idEnseignant;
	this.codeUE = codeUE;
	this.listeEtud = listeEtud;

    }

    public boolean isStudent(Integer i) {
        if (i > 0 && i <= listeEtud.size()) {
            return true;
        } else {
            System.err.println("Etudiant invalide !");
            return false;
        }
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

    public int getIdEnseignant() {
	return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
	this.idEnseignant = idEnseignant;
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

    public String toString() {
        String str = "Code matiere : " + this.codeMatiere + "\n"
                + "libelle ECUE : " + this.libelleECUE + "\n"
                + "idEnseignant : " + this.idEnseignant + "\n"
                + "UE parente : " + this.codeUE + "\n"
                + "nbHeures : " + this.nbHeures + "\n"
                + "Liste etudiants : \n";

        for(EtudiantECUE e : this.listeEtud) {
            str += "\t" + e.getNom() + " " + e.getPrenom() + " "+ e.getNumEtud() + " " + e.getNote1() + " " + e.getNote2() + "\n";
        }

        return str;
    }

}