package org.ougen.exam1.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Author: OuGen
 * Discription:
 * Date: 9:58 2019/7/26
 */
@Data
public class Customer {
    private int customerId;
    private int storeId;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @Email
    private String email;
    @NotNull
    private int addressId;
    private boolean active;
    private Date createDate;
    private Date lastUpdate;
}
