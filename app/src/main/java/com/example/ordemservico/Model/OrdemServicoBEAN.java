package com.example.ordemservico.Model;

public class OrdemServicoBEAN {
    private int numeroServico;
    private String descricaoServico;
    private String setorServico;
    private String statusServico;
    private String solicitanteServico;
    private String observacaoDetalhada;

    public OrdemServicoBEAN(int numeroServico, String descricaoServico, String setorServico, String statusServico, String solicitanteServico, String observacaoDetalhada) {
        this.numeroServico = numeroServico;
        this.descricaoServico = descricaoServico;
        this.setorServico = setorServico;
        this.statusServico = statusServico;
        this.solicitanteServico = solicitanteServico;
        this.observacaoDetalhada = observacaoDetalhada;
    }

    public OrdemServicoBEAN() {
    }

    public int getNumeroServico() {
        return numeroServico;
    }

    public void setNumeroServico(int numeroServico) {
        this.numeroServico = numeroServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getSetorServico() {
        return setorServico;
    }

    public void setSetorServico(String setorServico) {
        this.setorServico = setorServico;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public String getSolicitanteServico() {
        return solicitanteServico;
    }

    public void setSolicitanteServico(String solicitanteServico) {
        this.solicitanteServico = solicitanteServico;
    }

    public String getObservacaoDetalhada() {
        return observacaoDetalhada;
    }

    public void setObservacaoDetalhada(String observacaoDetalhada) {
        this.observacaoDetalhada = observacaoDetalhada;
    }
}
