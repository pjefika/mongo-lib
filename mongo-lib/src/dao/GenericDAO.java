/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface GenericDAO<T> {

    public T save(T t) throws Exception;

    public T update(T t) throws Exception;

    public void delete(T t) throws Exception;

    public T read(ObjectId id) throws Exception;

}
