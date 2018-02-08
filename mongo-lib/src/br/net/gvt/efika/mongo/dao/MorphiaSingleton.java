/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.mongo.dao;

import br.net.gvt.efika.mongo.dao.converter.BigIntegerConverter;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author G0042204
 */
public class MorphiaSingleton {

    private static MorphiaSingleton uniqueInstance;

    private static Morphia morphia;

    private MorphiaSingleton() {
    }

    public static synchronized MorphiaSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MorphiaSingleton();
            morphia = new Morphia();
            morphia.getMapper().getConverters().addConverter(BigIntegerConverter.class);
        }

        return uniqueInstance;
    }

    public static Morphia getMorphia() {
        return morphia;
    }


}
