/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author G0042204
 */
@Entity("mongo_pojo")
public class MongoEntityTest extends AbstractMongoEntity {

    private String valor;

    public MongoEntityTest() {
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
