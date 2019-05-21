package com.example.dubboprovider.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T, ID extends Serializable, R extends BaseRepository<T, ID>> {
    /**
     * 获取Repository
     *
     * @return
     */
    R getRepository();

    T save(T t);

    T update(T t);

    T get(ID id);

    void delete(ID id);

    void delete(T t);

    boolean exists(ID id);

    long count();

    List<T> findAll();

    List<T> findAll(Sort sort);

    List<T> findAll(Specification<T> specification);

    Page<T> findAll(Pageable pageable);

    Page<T> findPage(Specification<T> specification, Pageable pageable);
}
