package com.github.arorasagar.projectplanner.project;

import com.github.arorasagar.projectplanner.sprint.Sprint;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String projectId;

    private String projectName;

    private String startDate;

    private boolean isActive;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Sprint> sprints;
}
