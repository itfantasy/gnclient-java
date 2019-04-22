package io.github.itfantasy.janet.nets;

import io.github.itfantasy.janet.Error;

/**
 * Created by jgao on 2019/4/22.
 */
public interface INetEventListener {

    void onConn();

    void onMsg(byte[] msg);

    void onClose();

    void onError(Error err);
}
