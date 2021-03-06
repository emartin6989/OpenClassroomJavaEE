package com.sdzee.tp.beans;

public class Commande {
    private String date;
    private double montant;
    private String modePaiement;
    private String StatutPaiement;
    private String modeLivraison;
    private String StatutLivraison;
    private Client client;

    public String getDate() {
        return date;
    }

    public void setDate( String date ) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant( double montant ) {
        this.montant = montant;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement( String modePaiement ) {
        this.modePaiement = modePaiement;
    }

    public String getStatutPaiement() {
        return StatutPaiement;
    }

    public void setStatutPaiement( String statutPaiement ) {
        StatutPaiement = statutPaiement;
    }

    public String getModeLivraison() {
        return modeLivraison;
    }

    public void setModeLivraison( String modeLivraison ) {
        this.modeLivraison = modeLivraison;
    }

    public String getStatutLivraison() {
        return StatutLivraison;
    }

    public void setStatutLivraison( String statutLivraison ) {
        StatutLivraison = statutLivraison;
    }

    public Client getClient() {
        return client;
    }

    public void setClient( Client client ) {
        this.client = client;
    }

    public Commande() {
        super();
    }

}
