package com.a11.schedule.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
@Table(name = "cathedras")
public class Cathedra implements CategoryEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @NotNull @Size(min = 3, message = "Cathedra name is too short")
    public String name;
    @Column(name = "faculty_id")
    public Long facultyId;

    @Override
    public String getName() {
        return name;
    }

}
