/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.GCAM.StudentManager.Persist.XML;

import fr.GCAM.StudentManager.Business.POJO.Departement;
import java.util.ArrayList;
import java.util.Iterator;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

/**
 * Cette classe définit les methodes de l'interface DAO pour le type Departement
 * (POJO).
 * Le fichier XML utilisé par cette classe est "xml/Departement.xml"
 *
 * @author pierre
 */
public class XMLDepartement extends XML<Departement> {

    public XMLDepartement() {
    }

    /**
     * Methode permettant la création d'un Departement
     *
     * @param obj le Departement qui doit être insérée dans le fichier XML
     * @throws Exception
     */
    public void create(Departement obj) throws Exception {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Methode permettant la modification d'un Departement
     *
     * @param obj le Departement qui doit être modifiée dans le fichier XML
     * @throws Exception
     */
    public void update(Departement obj) throws Exception {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Methode permettant la suppression d'un Departement
     *
     * @param obj le Departement qui doit être supprimée dans le fichier XML
     * @throws Exception
     */
    public void delete(Departement obj) throws Exception {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * La fonction, renvoie un POJO Departement, a partir de l'id passé en parametre.<br>
     *
     * @param id(String) La versionEtape du département que l'on souhaite charger
     * @return Le departement correspondant à l'élement trouvé dans le fichier XML a partir de l'id
     * @throws Exception
     */
    public Departement find(Object id) throws Exception {
        Departement dept = new Departement();

        Element courant;
        Iterator i = new SAXBuilder().build("xml/Departement.xml").getRootElement().getChildren("Departement").iterator();
        Iterator j;
        while (i.hasNext()) {
            courant = (Element) i.next();
            if (courant.getChild("versionDiplome").getText().equals((String) id)) {
                dept.setVersionDiplome(courant.getChild("versionDiplome").getText());
                dept.setNomDepartement(courant.getChild("nomDepartement").getText());
                dept.setMnemo(courant.getChild("mNemo").getText());

                j = courant.getChild("listeEtape").getChildren("Etape").iterator();
                while (j.hasNext()) {
                    courant = (Element) j.next();
                    dept.getListeEtape().add(new XMLEtape().find(courant.getChildText("codeEtape")));
                }
            }
        }
        return dept;
    }

    /**
     * Methode permettant de lister les Departements
     * @return La liste des departements
     * @throws Exception
     */
    public ArrayList<Departement> list() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
