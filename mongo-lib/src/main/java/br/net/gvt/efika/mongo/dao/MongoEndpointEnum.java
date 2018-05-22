/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.mongo.dao;

/**
 *
 * @author G0042204
 */
public enum MongoEndpointEnum {

//    MONGO("10.200.35.67");
    MONGO("10.40.197.125");

    private final String ip;

    private MongoEndpointEnum(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

}
