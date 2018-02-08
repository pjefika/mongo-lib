/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.mongo.dao.converter;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.math.BigInteger;
import org.mongodb.morphia.converters.SimpleValueConverter;
import org.mongodb.morphia.converters.TypeConverter;
import org.mongodb.morphia.mapping.MappedField;
import org.mongodb.morphia.mapping.MappingException;

/**
 *
 * @author G0041775
 */


public class BigIntegerConverter extends TypeConverter implements SimpleValueConverter {

    public BigIntegerConverter() {
        super(BigInteger.class);
    }

    @Override
    public Object encode(Object value, MappedField optionalExtraInfo) {
        if (value == null) {
            return null;
        }
        BigInteger bigIntegerValue = (BigInteger) value;

        DBObject dbo = new BasicDBObject();

        dbo.put("value", bigIntegerValue.longValue());

        return dbo;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Object decode(Class targetClass, Object fromDBObject, MappedField field) throws MappingException {
        DBObject dbo = (DBObject) fromDBObject;
        if (dbo == null) {
            return null;
        }

        BigInteger bigInteger = null;

        Long value = (Long) dbo.get("value");

        if (value != null) {
            bigInteger = new BigInteger(value.toString());
        }

        return bigInteger;
    }

}
