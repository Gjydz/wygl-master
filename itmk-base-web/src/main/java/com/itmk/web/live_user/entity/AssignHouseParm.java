package com.itmk.web.live_user.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname AssignHouseParm
 * @Description
 */
@Data
public class AssignHouseParm implements Serializable {
    private Long userId;
    private Long houseId;

}
