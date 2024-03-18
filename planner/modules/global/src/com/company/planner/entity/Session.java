package com.company.planner.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PLANNER_SESSION")
@Entity(name = "planner_Session")
public class Session extends StandardEntity {
    @NotNull
    @Column(name = "")
}