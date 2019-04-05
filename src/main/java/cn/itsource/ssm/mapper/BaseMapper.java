package cn.itsource.ssm.mapper;

import java.util.List;

public interface BaseMapper<T> {
    void add(T t);

    void delete(Long id);

    void update(T t);

    T findOne(Long id);

    List<T> findAll();
}
