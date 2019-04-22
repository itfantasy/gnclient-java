package io.github.itfantasy.janet.nets;

import io.github.itfantasy.janet.IAction;
import io.github.itfantasy.janet.Error;

/**
 * Created by jgao on 2019/4/22.
 */
public interface INetWorker {

    void connect(String url);

    Error send(byte[] msg);

    Error sendAsync(byte[] msg, IAction<Boolean> callback);

    Error bindEventListener(INetEventListener eventListener);

    void close();

    boolean update();

    boolean connected();

}
