package es.lanyu.juego.tiempo;

import es.lanyu.commons.tiempo.Cronometro;
import es.lanyu.juego.Objetivo;

public interface CronometroJuego extends Cronometro {

    default boolean usarTemporizable(TemporizableSobreObjetivo temporizable, Objetivo objetivo) {
        boolean usada = false;

        if (!getTemporizadores().containsKey(temporizable)) {
            getTemporizadores().put(temporizable, nuevoTemporizador(temporizable));
            usada = temporizable.ejecutarSobre(objetivo);
        }

        return usada;
    }

}
