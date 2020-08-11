package es.lanyu.juego;

import java.text.DecimalFormat;

import es.lanyu.juego.Atributo.TipoAtributo;

public class Efecto implements Causante {
    static DecimalFormat formatoValor = new DecimalFormat("#.#");// , new DecimalFormatSymbols(Locale.ENGLISH));
    TipoAtributo atributoAfectado;
    float valor;
    boolean relativo;

    public Efecto(TipoAtributo atributoAfectado, float valor, boolean relativo) {
        super();
        this.atributoAfectado = atributoAfectado;
        this.valor = valor;
        this.relativo = relativo;
    }

    public Efecto(TipoAtributo atributoAfectado, float valor) {
        this(atributoAfectado, valor, false);
    }

    @Override
    public TipoAtributo getAtributoAfectado() {
        return atributoAfectado;
    }

    @Override
    public float getValor() {
        return valor;
    }

    @Override
    public boolean isRelativo() {
        return relativo;
    }

    @Override
    public String toString() {
        return "Efecto: " + getAtributoAfectado() + " " + formatoValor.format(getValor());
    }

}
