package es.lanyu.juego;

public interface Objetivo extends EnteConAtributos, Afectable {

    default boolean recibeEfecto(Causante efecto, float modificador) {
        boolean afectado = false;
        if (efecto != null) {
            Atributo atributo = getAtributo(efecto.getAtributoAfectado());

            float valorPrevio, valorEfecto;
            if (atributo != null) {
                valorPrevio = atributo.getValor();
                valorEfecto = efecto.getValor() * modificador;

                if (!efecto.isRelativo())
                    atributo.setValor(valorPrevio + valorEfecto);
                else
                    atributo.setValor(valorPrevio * valorEfecto);

                afectado = atributo.getValor() != valorPrevio;
            }
        }

        return afectado;
    }

}
