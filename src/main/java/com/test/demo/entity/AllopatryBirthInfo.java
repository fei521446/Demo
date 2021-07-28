package com.test.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author fhl
 * @since 2021-07-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("allopatry_birth_info")
public class AllopatryBirthInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 申报人公民身份号码
     */
    private String declarantCardNumber;

    /**
     * 申报人姓名
     */
    private String declarantName;

    /**
     * 申报人联系电话
     */
    private String declarantPhone;

    /**
     * 申报人家庭关系
     */
    private String declarantFamilyRelation;

    /**
     * 现居住地址省市县(区)
     */
    private String currentAddress;

    /**
     * 现居住地址区划内详细地址
     */
    private String detailAddress;

    /**
     * 户主姓名
     */
    private String householderName;

    /**
     * 户主公民身份号码
     */
    private String householderCardNumber;


}
