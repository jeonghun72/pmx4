package com.pmx.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter

public abstract class BaseTimeEntity {

    private LocalDateTime regTime;


    private LocalDateTime updateTime;

}