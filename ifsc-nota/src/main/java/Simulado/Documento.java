package Simulado;


import java.time.LocalDate;
import java.util.Date;

public class Documento {
    private Paciente paciente;
    private String responsavel;
    private String solicitante;
    private Date dataSolicitacao;
    private TipoExame[] exames;

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

    public TipoExame[] getExames() {
        return exames;
    }

    public void setExames(TipoExame[] exames) {
        this.exames = exames;
    }

    public static void main(String[] args){
        Documento documento = new Documento();
        Paciente paciente = new Paciente();
        TipoExame tipoExame = new TipoExame();
        TipoExame tipoExame1 = new TipoExame();
        Exame exame = new Exame();
        Exame exame1 = new Exame();
        Exame[] exames = new Exame[2];
        Empresa empresa = new Empresa();
        Endereco enderecoEmpresa = new Endereco();

        enderecoEmpresa.setLogradouro("Av. Prof. Lineu Prestes");
        enderecoEmpresa.setNumero("2565");
        enderecoEmpresa.setBairro("Cidade Universitária");
        enderecoEmpresa.setCidade("São Paulo");
        enderecoEmpresa.setcep("05508-000");

        empresa.setCnpj("99999999");
        empresa.setTelefone("(11) 3091-9200");
        empresa.setNomeFantasia("Hospital Universitário da USP");
        empresa.setEndereco(enderecoEmpresa);

        paciente.setMatricula("123");
        paciente.setNomeCompleto("Edson Junior");
        paciente.setNascimento(new Date("14/02/2000"));
        paciente.setSexo("Masculino");

        documento.setResponsavel("medico");
        documento.setSolicitante("nutricionista");

        documento.setDataSolicitacao(new Date());

        tipoExame.setCodigo("150220");
        tipoExame.setNome("CULTURA AERÓBICA");
        tipoExame.setMaterial(TipoExame.Material.FEZES);
        tipoExame.setDiasResultado(3);

        tipoExame1.setCodigo("150240");
        tipoExame1.setNome("CULTURA DE BAAR");
        tipoExame1.setMaterial(TipoExame.Material.FEZES);
        tipoExame1.setDiasResultado(15);

        LocalDate agora = LocalDate.now();
        exame.setTipoExame(tipoExame);
        exame.setDataColeta(agora);
        exame1.setTipoExame(tipoExame1);
        exame1.setDataColeta(agora);

        exame.calculaPrevisaoResultado();
        exame1.calculaPrevisaoResultado();



    }
}
