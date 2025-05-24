package Simulado;

import java.util.Date;

public class TipoExame {
       public enum Material{FEZES, URINA, SANGUE}
    private String codigo;
    private String nome;
    private Material material;
    private Integer diasResultado;

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

    public Integer getDiasResultado() {
        return diasResultado;
    }

    public void setDiasResultado(Integer diasResultado) {
        this.diasResultado = diasResultado;
    }
}
