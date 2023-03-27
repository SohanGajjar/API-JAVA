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
@Table(name = "tr_programs_tracker")
public class ProgramTracker {
    @Id
    @SequenceGenerator(name = "tr_programs_tracker_sequence",sequenceName = "tr_programs_tracker_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tr_programs_tracker_sequence")
    private Long id;
    @ManyToOne
    @Column(name = "program_id")
    private Programs program;
    @Column(nullable = false,name = "start_date")
    private Date startDate;
    @Column(nullable = false,name = "end_name")
    private Date endDate;
    @Column(columnDefinition = "boolean default false")
    private boolean isPublished;
    @Column(columnDefinition = "boolean default false")
    private boolean isStarted;
    @Column(columnDefinition = "boolean default false")
    private boolean isEnded;
    private Long createdBy;
    private Long updatedBy;
    private Date createdAt;
    private Date updatedAt;
}
