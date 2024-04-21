package com.pmx.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public abstract class BaseEntity extends BaseTimeEntity{


    private String createdBy;

    private String modifiedBy;

}