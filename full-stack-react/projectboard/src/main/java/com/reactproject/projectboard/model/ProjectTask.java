package com.reactproject.projectboard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="task")
public class ProjectTask {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Summary need to be submit!!")
	private String summary;
	private String acceptanceCriteria;
	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getacceptanceCriteria() {
		return acceptanceCriteria;
	}
	public void setacceptanceCriteria(String acceptanceCriteria) {
		this.acceptanceCriteria = acceptanceCriteria;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	public ProjectTask(Long id, @NotBlank(message = "Summary need to be submit!!") String summary,
			String acceptanceCriteria, String status) {
		super();
		this.id = id;
		this.summary = summary;
		this.acceptanceCriteria = acceptanceCriteria;
		this.status = status;
	}
public ProjectTask() {
	
}
@Override
public String toString() {
	return "ProjectTask [id=" + id + ", summary=" + summary + ", acceptanceCriteria=" + acceptanceCriteria + ", status="
			+ status + "]";
}


}
