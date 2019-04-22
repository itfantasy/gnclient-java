package io.github.itfantasy.janet.nets.ws;


import io.github.itfantasy.janet.Error;
import io.github.itfantasy.janet.IAction;
import io.github.itfantasy.janet.nets.INetEventListener;
import io.github.itfantasy.janet.nets.INetWorker;

/**
 * Created by jgao on 2019/4/22.
 */
public class WSNetWorker implements INetWorker {


    public void connect(String url) {

    }

    public Error send(byte[] msg) {
        return null;
    }

    public Error sendAsync(byte[] msg, IAction<Boolean> callback) {
        return null;
    }

    public Error bindEventListener(INetEventListener eventListener) {
        return null;
    }

    public void close() {

    }

    public boolean update() {
        return false;
    }

    public boolean connected() {
        return false;
    }
}
