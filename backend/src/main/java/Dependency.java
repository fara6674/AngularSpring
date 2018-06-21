import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Dependency {
	
	@Id
	private String depId;
	
	@Column
	private String status;
	
	@Column
	private String jiraStoryId;
	
	@Column /*(name = "time")*/
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-dd-mm")
	private Date startDate;

	@Column /*(name = "date")*/
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-dd-mm")
	private Date endDate;
	
	@Column
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
	private Date duration;

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getJiraStoryId() {
		return jiraStoryId;
	}

	public void setJiraStoryId(String jiraStoryId) {
		this.jiraStoryId = jiraStoryId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Dependency [depId=" + depId + ", status=" + status + ", jiraStoryId=" + jiraStoryId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", duration=" + duration + "]";
	}
	
	
}
