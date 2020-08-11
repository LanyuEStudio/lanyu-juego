package es.lanyu.juego;

import es.lanyu.juego.Atributo.TipoAtributo;

public interface Viviente extends EnteConAtributos {

    default Atributo getVitalidadMaxima() {
        return getAtributo(TipoAtributo.Vitalidad_Maxima);
    }

    default Atributo getVitalidad() {
        return getAtributo(TipoAtributo.Vitalidad);
    }

    default boolean estaVivo() {
        return getVitalidad().getValor() > 0;
    }

}
