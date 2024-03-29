/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.GCAM.StudentManager.Business.Facade;

import fr.GCAM.StudentManager.Business.Manager.ManagerUtilisateur;
import fr.GCAM.StudentManager.Business.POJO.Utilisateur;
import fr.GCAM.StudentManager.Business.POJO.Utilisateur.Responsabilite;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ben
 */
public class FacadeUtilisateur {

    ManagerUtilisateur utilisateur;

    public FacadeUtilisateur(String dao) {
        utilisateur = new ManagerUtilisateur(dao);
    }

    /**
     * methode login
     * Le HasMap renvoyé contient le nom, le prenom, la plus haute responsabilité
     * et le code de la plus haute responsabilité de l'utilisateur connecté.
     *
     */
    public HashMap< String, String > login(String nom, String prenom, String mdp){
        return utilisateur.login(nom, prenom, mdp);
    }

    public Utilisateur[] getListLogin() throws Exception {
        return utilisateur.getListLogin();
    }
    
    public void create(Utilisateur u) throws Exception {
        utilisateur.create(u);
    }
    
    public void delete(Utilisateur u) throws Exception {
        utilisateur.delete(u);
    }

    public ArrayList<Responsabilite> getListeRespDispo() throws Exception {
        return utilisateur.getListRespDispo();
    }

    public void update(Utilisateur u) throws Exception {
        utilisateur.update(u);
    }

}
