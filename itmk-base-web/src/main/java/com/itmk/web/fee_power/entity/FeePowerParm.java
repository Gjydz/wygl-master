package com.itmk.web.fee_power.entity;

import lombok.Data;

/**
 * @Classname FeePowerParm
 * @Description
 */
@Data
public class FeePowerParm {

    private String userName; //业主姓名
    private String houseNum; //房屋编号
    private Long currentPage; //当前页
    private Long pageSize;  //页容量
    private Long userId;
}
