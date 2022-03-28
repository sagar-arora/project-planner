package com.github.arorasagar.projectplanner.sprint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.arorasagar.projectplanner.project.Project;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String sprintId;

    private String sprintName;

    private Date startDate;

    private Date endDate;

    private boolean isActive;

    @ManyToOne
    @JsonIgnore
    private Project project;
}
