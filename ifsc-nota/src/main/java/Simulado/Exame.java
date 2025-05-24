package Simulado;

import java.time.LocalDate;

public class Exame {
    private TipoExame tipoExame;
    private LocalDate dataColeta;

    public TipoExame getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(TipoExame tipoExame) {
        this.tipoExame = tipoExame;
    }

    public LocalDate getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(LocalDate dataColeta) {
        this.dataColeta = dataColeta;
    }

    public LocalDate calculaPrevisaoResultado(){
        return dataColeta.plusDays(tipoExame.getDiasResultado());
    }
}
