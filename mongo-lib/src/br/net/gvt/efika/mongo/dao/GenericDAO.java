/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.mongo.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.query.UpdateOperations;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface GenericDAO<T> {

    public T save(T t) throws Exception;

    public T update(T t, UpdateOperations<T> opers) throws Exception;

    public void delete(T t) throws Exception;

    public T read(ObjectId id) throws Exception;

    public UpdateOperations<T> createUpdateOperations();

}
