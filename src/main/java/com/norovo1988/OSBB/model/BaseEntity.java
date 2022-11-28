package com.norovo1988.OSBB.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create")
    @CreatedDate
    private Date create;

    @Column(name = "update")
    @LastModifiedDate
    private Date update;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status Status;
}
