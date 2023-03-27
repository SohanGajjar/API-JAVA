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
@Table(name = "mstr_programs")
public class Programs {
    @Id
    @SequenceGenerator(name = "mstr_programs_sequence",sequenceName = "mstr_programs_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mstr_programs_sequence")
    private Long id;
    @NotNull
    private String name;
    private String thumbnail_image_url;
    private String program_overiew;
    private String image_url;
    private String program_outcome;
    private int program_duration;
    private Long created_by;
    private Long updated_by;
    private Date created_at;
    private Date updated_at;
}
