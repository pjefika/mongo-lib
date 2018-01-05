/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

/**
 *
 * @author G0042204
 */
public abstract class AbstractMongoEntity {

    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;

    public AbstractMongoEntity() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

}
