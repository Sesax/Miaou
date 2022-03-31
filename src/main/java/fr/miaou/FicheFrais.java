package fr.miaou;

import java.time.LocalDate;

public class FicheFrais {

    private int fk_ag;
    private int fdrm_mois;
    private LocalDate fdrm_reception;
    private LocalDate fdrm_validation;
    private LocalDate fdrm_paiement;
    private LocalDate fdrm_remboursement;
    private int nbrj_conges;
    private String nomVisiteur;

    public FicheFrais(int ag, int mois) {
        fk_ag = ag;
        fdrm_mois = mois;
        nomVisiteur = MainApp.con.agGetNom(fk_ag);
    }

    public FicheFrais(int ag, int mois, LocalDate reception, LocalDate validation, LocalDate paiement,
            LocalDate remboursement, int conges) {
        fk_ag = ag;
        fdrm_mois = mois;
        fdrm_reception = reception;
        fdrm_validation = validation;
        fdrm_paiement = paiement;
        fdrm_remboursement = remboursement;
        nbrj_conges = conges;
        nomVisiteur = MainApp.con.agGetNom(fk_ag);
    }

    public String getNomVisiteur() {
        return this.nomVisiteur;
    }

    public int getAg() {
        return this.fk_ag;
    }

    public int getFdrmMois() {
        return this.fdrm_mois;
    }

    public void setReception(LocalDate date) {
        this.fdrm_reception = date;
    }

    public String getReception() {
        if (this.fdrm_reception == null) {
            return "En attente";
        }
        return this.fdrm_reception.toString();
    }

    public void setValidation(LocalDate date) {
        this.fdrm_validation = date;
    }

    public String getValidation() {
        if (this.fdrm_validation == null) {
            return "En attente";
        }
        return this.fdrm_validation.toString();
    }

    public void setPaiement(LocalDate date) {
        this.fdrm_paiement = date;
    }

    public String getPaiement() {
        if (this.fdrm_paiement == null) {
            return "En attente";
        }
        return this.fdrm_paiement.toString();
    }

    public void setRemboursement(LocalDate date) {
        this.fdrm_remboursement = date;
    }

    public String getRemboursement() {
        if (this.fdrm_remboursement == null) {
            return "En attente";
        }
        return this.fdrm_remboursement.toString();
    }

    public int getNbrjConges() {
        return this.nbrj_conges;
    }

    public void decrireFiche(int id) {

        if (fk_ag == id) {
            System.out.println("Caractéristiques de la fiche de frais-------");
            System.out.println("Mois de la fiche de frais : " + fdrm_mois);
            System.out.println("Date de reception : " + fdrm_reception);
            System.out.println("Date de validation : " + fdrm_validation);
            System.out.println("Date de paiement : " + fdrm_paiement);
            System.out.println("Date remboursement : " + fdrm_remboursement);
            System.out.println("Nombre de jours de congés : " + nbrj_conges);
        }
    }

    public String getMois() {
        String mois;
        switch (fdrm_mois) {
            case 1:
                mois = "Janvier";
                break;
            case 2:
                mois = "Fevrier";
                break;
            case 3:
                mois = "Mars";
                break;
            case 4:
                mois = "Avril";
                break;
            case 5:
                mois = "Mai";
                break;
            case 6:
                mois = "Juin";
                break;
            case 7:
                mois = "Juillet";
                break;
            case 8:
                mois = "Aout";
                break;
            case 9:
                mois = "Septembre";
                break;
            case 10:
                mois = "Octobre";
                break;
            case 11:
                mois = "Novembre";
                break;
            case 12:
                mois = "Decembre";
                break;
            default:
                mois = "Error";
        }
        return mois;
    }

    public int getMoisEntier() {
        return this.fdrm_mois;
    }

}
