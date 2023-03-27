package com.example.API_java.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tr_grades")
public class Grades {
    @Id
    @SequenceGenerator(name = "tr_grades_sequence",sequenceName = "tr_grades_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tr_grades_sequence")
    private Long id;
    @OneToOne
    private Programs program_id;
    private Long skill_sub_cat_id;//link table value
    private int marks;
    @OneToOne
    private User user_id;
    private Long created_by;
    private Long updated_by;
    private Date created_at;
    private Date updated_at;
}
