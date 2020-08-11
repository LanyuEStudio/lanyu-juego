package es.lanyu.juego;

import java.util.Collection;

import es.lanyu.juego.Atributo.TipoAtributo;

public interface EnteConAtributos {

    Collection<Atributo> getAtributos();

    default Atributo getAtributo(TipoAtributo tipo) {
        Atributo atributo = null;
        for (Atributo a : getAtributos()) {
            if (a.getTipo() == tipo) {
                atributo = a;
                break;
            }
        }

        return atributo;
    }

}
