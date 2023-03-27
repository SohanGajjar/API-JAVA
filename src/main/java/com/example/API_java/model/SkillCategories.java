package com.example.API_java.model;

import com.sun.istack.NotNull;
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
@Table(name = "mstr_skill_categories")
public class SkillCategories {
    @Id
    @SequenceGenerator(name = "mstr_skill_categories_sequence",sequenceName = "mstr_skill_categories_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mstr_skill_categories_sequence")
    private Long id;
    @NotNull
    private String name;
    @Column (columnDefinition = "BOOLEAN DEFAULT true")
    private boolean is_active;
    private Long created_by;
    private Long updated_by;
    private Date created_at;
    private Date updated_at;
}
