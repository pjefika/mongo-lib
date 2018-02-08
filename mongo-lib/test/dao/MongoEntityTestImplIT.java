/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.net.gvt.efika.mongo.dao.MongoEntityTestImpl;
import br.net.gvt.efika.mongo.model.entity.MongoEntityTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mongodb.morphia.Key;

/**
 *
 * @author G0042204
 */
public class MongoEntityTestImplIT {

    public MongoEntityTestImplIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSave() {
        try {
            System.out.println("save");
            MongoEntityTest d = new MongoEntityTest();
            d.setValor("devd");
            MongoEntityTestImpl instance = new MongoEntityTestImpl();
            MongoEntityTest save = instance.save(d);
            System.out.println("saved");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testDelete() {
        try {
            System.out.println("delete");
            MongoEntityTest d = new MongoEntityTest();
            d.setValor("kasjdhflkshdlkfjshdlkjfh");
            MongoEntityTestImpl instance = new MongoEntityTestImpl();
            instance.save(d);
            Thread.sleep(3000);
            instance.delete(d);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
