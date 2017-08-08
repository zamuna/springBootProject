package com.example.demo.com.DAO;

import com.example.demo.com.model.Episodes;

import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
public interface IEpisodesDao {
    public abstract List<Episodes> getAll();

    public abstract void add(Episodes episodes);

    public abstract Episodes get(int id);

    public abstract void update(int episodesId, Episodes episodes);

    public abstract void delete(int episodesId);
}
