package io.github.itfantasy.janet;

/**
 * Created by jgao on 2019/4/22.
 */
public class Error {

    private String text = "";

    public boolean nil() {
        return text == "";
    }

    private Object token = null;

    public Error(String text) {
        this.text = text;
    }

    public String error() {
        return this.text;
    }

    public Object result() {
        return this.token;
    }

    public Error attachResult(Object result){
        this.token = result;
        return this;
    }
}
