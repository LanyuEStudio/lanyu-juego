package es.lanyu.juego;

public interface Afectable {

    boolean recibeEfecto(Causante efecto, float modificador);

    default boolean recibeEfecto(Causante efecto) {
        // Por defecto se recibe el 100% del efecto = 1f
        return recibeEfecto(efecto, 1f);
    }

}
