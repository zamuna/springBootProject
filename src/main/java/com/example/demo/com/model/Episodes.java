package com.example.demo.com.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
@Entity
public class Episodes {
    @Id @GeneratedValue
    private Integer episodeId;
    @ElementCollection
    List<Cast> casts;

}
