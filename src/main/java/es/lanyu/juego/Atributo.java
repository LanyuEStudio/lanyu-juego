package es.lanyu.juego;

public class Atributo {
    TipoAtributo tipo;
    float valor;

    public enum TipoAtributo {
        // Durabilidad_Maxima ("Durabilidad: Resistencia maxima a los efectos"),
        // Durabilidad ("Durabilidad: Resistencia actual"),
        Vitalidad_Maxima("Vitalidad: Energía vital máxima que se puede acumular"),
        Vitalidad("Vitalidad: Energia vital actual que le mantiene con vida"),
        Fuerza("Fuerza: Fortaleza mecanica capaz de crear cambios soble la materia");

        String descripcion;

        private TipoAtributo(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }

    };

    public Atributo(TipoAtributo tipo, float valor) {
        super();
        this.tipo = tipo;
        setValor(valor);
    }

    public Atributo getCopia() {
        return new Atributo(getTipo(), getValor());
    }

    public TipoAtributo getTipo() {
        return tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void addValor(float valor) {
        this.valor += valor;
    }

    @Override
    public String toString() {
        return getTipo() + " (" + getValor() + ")";
    }

}
