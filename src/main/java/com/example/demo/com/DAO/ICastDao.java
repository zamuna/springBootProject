package com.example.demo.com.DAO;

import com.example.demo.com.model.Cast;

import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
public interface ICastDao {
    public abstract List<Cast> getAll();

    public abstract void add(Cast cast);

    public abstract Cast get(int id);

    public abstract void update(int castId, Cast cast);

    public abstract void delete(int castId);

}
