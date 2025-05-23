package Simulado;

import java.util.Date;

public class Exame {
    public enum Material{FEZES, URINA, SANGUE}
    private String codigo;
    private String nome;
    private Material material;
    private Date dataColeta;
    private Date previsaoResultado;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Date getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }

    public Date getPrevisaoResultado() {
        return previsaoResultado;
    }

    public void setPrevisaoResultado(Date previsaoResultado) {
        this.previsaoResultado = previsaoResultado;
    }
}
