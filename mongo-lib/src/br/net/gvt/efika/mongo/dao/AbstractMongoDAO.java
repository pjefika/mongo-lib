/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.mongo.dao;

import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.UpdateOperations;

/**
 *
 * @author G0042204
 * @param <T>
 */
public abstract class AbstractMongoDAO<T> implements GenericDAO<T> {

    private static Datastore datastore;

    private final String ipAddress, dbName;

    private final Class<T> typeParameterClass;

    public AbstractMongoDAO(String ipAddress, String dbName, Class<T> typeParameterClass) {
        this.ipAddress = ipAddress;
        this.dbName = dbName;
        this.typeParameterClass = typeParameterClass;
    }

    public Datastore getDatastore() {
        if (datastore == null) {
            datastore = MorphiaSingleton.getInstance().getMorphia().createDatastore(new MongoClient(ipAddress), dbName);
        }
        return datastore;
    }

    @Override
    public UpdateOperations<T> createUpdateOperations() {
        return getDatastore().createUpdateOperations(typeParameterClass);
    }

    @Override
    public T save(T t) throws Exception {
        getDatastore().save(t);
        return t;
    }

    @Override
    public T update(T t, UpdateOperations<T> opers) throws Exception {
        return (T) getDatastore().update(t, opers);
    }

    @Override
    public void delete(T t) throws Exception {
        getDatastore().delete(t);
    }

    @Override
    public T read(ObjectId id) throws Exception {
        return getDatastore().get(typeParameterClass, id);
    }

    public Class<T> getTypeParameterClass() {
        return typeParameterClass;
    }

}
