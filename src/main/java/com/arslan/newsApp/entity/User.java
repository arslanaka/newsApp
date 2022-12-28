package com.arslan.newsApp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_tbl")
public class User {


    @Id
    @Column(name = "userId")
    private Integer id;

    @Column(name = "")
    private String fName;
    @Column(name = "")
    private String lName;
    @Column(name = "")
    private String mobile;
    @Column(name = "")
    private Integer userType;
    @Column(name = "")
    private Boolean active;
    @Column(name = "")
    private Boolean subscribe;







}
