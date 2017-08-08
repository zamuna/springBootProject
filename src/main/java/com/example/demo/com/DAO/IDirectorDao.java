package com.example.demo.com.DAO;

import com.example.demo.com.model.Director;

import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
public interface IDirectorDao {
    public abstract List<Director> getAll();

    public abstract void add(Director director);

    public abstract Director get(int id);

    public abstract void update(int directorId, Director director);

    public abstract void delete(int directorId);
}
