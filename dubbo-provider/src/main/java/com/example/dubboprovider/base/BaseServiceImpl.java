package com.example.dubboprovider.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T, ID extends Serializable, R extends BaseRepository<T, ID>> implements BaseService<T, ID, R> {
    @Autowired
    R baseRepository;

    @Override
    public R getRepository() {
        return baseRepository;
    }

    @Override
    public T save(T t) {
        return baseRepository.save(t);
    }

    @Override
    public T update(T t) {
        return baseRepository.saveAndFlush(t);
    }

    @Override
    public T get(ID id) {
        return baseRepository.getOne(id);
    }

    @Override
    public void delete(ID id) {
        baseRepository.deleteById(id);
    }

    @Override
    public void delete(T t) {
        baseRepository.delete(t);
    }

    @Override
    public boolean exists(ID id) {
        return baseRepository.existsById(id);
    }

    @Override
    public long count() {
        return baseRepository.count();
    }

    @Override
    public List<T> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public List<T> findAll(Sort sort) {
        return baseRepository.findAll(sort);
    }

    @Override
    public List<T> findAll(Specification<T> specification) {
        return baseRepository.findAll(specification);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    @Override
    public Page<T> findPage(Specification<T> specification, Pageable pageable) {
        return baseRepository.findAll(specification, pageable);
    }
}
