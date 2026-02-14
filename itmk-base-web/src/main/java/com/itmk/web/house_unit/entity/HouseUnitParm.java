package com.itmk.web.house_unit.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname HouseUnitParm
 * @Description
 */
@Data
public class HouseUnitParm implements Serializable {
    private String buildName;
    private String unitName;
    private Long currentPage;
    private Long pageSize;
}
