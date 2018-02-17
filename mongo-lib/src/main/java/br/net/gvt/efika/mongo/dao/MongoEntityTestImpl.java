/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.mongo.dao;

import br.net.gvt.efika.mongo.model.entity.MongoEntityTest;

public class MongoEntityTestImpl extends AbstractMongoDAO<MongoEntityTest> {

    public MongoEntityTestImpl() {
        super("*", "*", MongoEntityTest.class);
    }

}
