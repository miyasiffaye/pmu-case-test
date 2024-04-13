package com.pmu.course.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Course implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_course_id")
	private Long courseId;
	@Column(name = "course_name")
	private String name;
	@Column(name = "course_number")
	private int courseNumber;
	@Column(name = "course_date")
	private LocalDateTime courseDate;
	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)

	private Set<Partant> partants = new HashSet<>();

	public void setPartants(Set<Partant> partants) {
		this.partants = partants;
		partants.stream().forEach(p->p.setCourse(this));
	}
}
