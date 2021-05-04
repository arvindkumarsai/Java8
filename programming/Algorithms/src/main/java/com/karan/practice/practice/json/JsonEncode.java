package com.karan.practice.practice.json;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class JsonEncode {

    public static void main(String[] args) {

        JSONPObject object = new JSONPObject("callBack","hi");
        System.out.println(object.getFunction());

    }
}
