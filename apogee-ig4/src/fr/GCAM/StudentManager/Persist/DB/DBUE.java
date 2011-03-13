/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.GCAM.StudentManager.Persist.DB;

import fr.GCAM.StudentManager.POJO.UE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Cette classe définit les methodes de l'interface DAO pour le type UE
 * (POJO).
 *
 * @author pierre
 */
public class DBUE extends DB<UE> {

    public DBUE(Connection conn) {
        super(conn);
    }

    public void create(UE obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void update(UE obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(UE obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public UE find(Object id) throws Exception {
        UE ue = new UE();

        Statement s = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet result = s.executeQuery("SELECT * from VO_UE where codeUE = '" + (String) id + "'");
        if (result.first()) {
            ue.setCodeUE(result.getString("codeUE"));
            ue.setNbECTS(result.getInt("nbECTS"));
            ue.setLibelleUE(result.getString("libelleUE"));
            ue.setOptionnel(result.getString("optionnel").equals("t") ? true : false);
            ue.setResponsable(result.getString("prenomResponsable") + " " + result.getString("nomResponsable"));
            ue.setCodeSemestre(result.getString("codeSemestre"));

            do {
                ue.getListeECUE().add(new UE.ECUEUE(
                        result.getString("codeMatiere"),
                        result.getString("libelleECUE")));
            } while (result.next());
        }
        return ue;
    }

    /**
     *
     * @return L'ensemble des clés primaires (codeUE) des UE
     * @throws Exception
     * @deprecated 
     */
    public String list() throws Exception {
        String str = "";
        Statement s = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet result = s.executeQuery("SELECT distinct codeUE from VO_UE");
        if (result.first()) {
            do {
                str = str + result.getString(1) + "\n";
            } while (result.next());
        }
        return str;
    }
}
