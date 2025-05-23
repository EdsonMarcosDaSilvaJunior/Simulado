package Simulado;


import java.util.Date;

public class Documento {
    private Paciente paciente;
    private String responsavel;
    private String solicitante;
    private Date dataSolicitacao;
    private Exame[] exames;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Exame[] getExames() {
        return exames;
    }

    public void setExames(Exame[] exames) {
        this.exames = exames;
    }

    public static void main(String[] args){
        Documento documento = new Documento();
        Paciente paciente = new Paciente();
        paciente.setMatricula("123");
        paciente.setNomeCompleto("Edson Junior");
        paciente.setNascimento(new Date("14/02/2000"));

        documento.setResponsavel("medico");

    }
}
