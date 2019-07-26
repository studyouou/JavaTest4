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
    @NotEmpty(message = "firstName不能为空")
    private String firstName;
    @NotEmpty(message = "lastName不能为空")
    private String lastName;
    @Email(message = "格式错误")
    private String email;
    private int addressId;
    private boolean active;
    private Date createDate;
    private Date lastUpdate;
}
