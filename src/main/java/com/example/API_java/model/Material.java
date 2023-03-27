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
@Table(name = "tr_materials")
public class Material {

    @Id
    @SequenceGenerator(name = "tr_materials_sequence",sequenceName = "tr_materials_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tr_materials_sequence")
    private Long id;
    @NotNull
    private String material_url;
    @OneToOne
    private Programs program_id;
    private Long created_by;
    private Long updated_by;
    private Date created_at;
    private Date updated_at;
}
