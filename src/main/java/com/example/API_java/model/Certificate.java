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
@Table(name = "mstr_certificate_formats")
public class Certificate {
    @Id
    @SequenceGenerator(name = "mstr_certificate_formats_sequence",sequenceName = "mstr_certificate_formats_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mstr_certificate_formats_sequence")
    private Long id;
    @OneToOne
    @Column(name = "program_id")
    private Programs program;
    @Column(name = "doc_url")
    private String docUrl;
    @Column(name = "created_by")
    private Long createdBy;
    @Column(name = "updated_by")
    private Long updatedBy;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
}
