package org.ougen.exam1.model;

import lombok.Data;

import java.util.Date;

/**
 * Author: OuGen
 * Discription:
 * Date: 9:55 2019/7/26
 */
@Data
public class Film {
    private int filmId;
    private String title;
    private String description;
    private int release_year;
    private int language_id;
    private int original_language_id;
    private int rental_duration;
    private double rental_rate;
    private int length;
    private double replacement_cost;
    private Date last_update;
}
