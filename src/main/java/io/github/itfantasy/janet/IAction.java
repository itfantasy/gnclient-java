package io.github.itfantasy.janet;

/**
 * Created by jgao on 2019/4/22.
 */
public interface IAction<T> {
    void invoke(T token);
}
