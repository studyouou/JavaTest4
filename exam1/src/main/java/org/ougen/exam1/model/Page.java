package org.ougen.exam1.model;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:20 2019/7/26
 */
@Data
public class Page {
    @Min(0)
    @Max(20)
    @NotNull
    private int pageSize;
    @NotNull
    private int page;
    @NotEmpty
    private String sort = "ASC";
}
