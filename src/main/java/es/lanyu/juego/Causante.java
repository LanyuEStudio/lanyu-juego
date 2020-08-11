package es.lanyu.juego;

import es.lanyu.juego.Atributo.TipoAtributo;

public interface Causante {

    TipoAtributo getAtributoAfectado();

    float getValor();

    boolean isRelativo();

    default boolean afectar(Objetivo objetivo, float modificador) {
        boolean afectado = objetivo.recibeEfecto(this, modificador);

        return afectado;
    }

    default boolean afectar(Objetivo objetivo) {
        return afectar(objetivo, 1f);
    }

}