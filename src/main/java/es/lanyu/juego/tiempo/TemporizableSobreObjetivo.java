package es.lanyu.juego.tiempo;

import es.lanyu.commons.tiempo.Cronometrable;
import es.lanyu.juego.Objetivo;

public interface TemporizableSobreObjetivo extends Cronometrable {

    default boolean ejecutarSobre(Objetivo objetivo) { return true; }

}
