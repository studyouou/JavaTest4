package org.ougen.exam1.util;


import org.ougen.exam1.model.Model;

public class ModelUtil<T>{
    public static <T> Model getModel(String msg, int code, T t){
        Model<T> tModel = new Model<T>();
        tModel.setCode(code);
        tModel.setMsg(msg);
        tModel.setData(t);
        return tModel;
    }
}
