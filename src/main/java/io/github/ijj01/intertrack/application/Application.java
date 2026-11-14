package io.github.ijj01.intertrack.application;
import jakarta.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import static io.github.ijj01.intertrack.application.ApplicationStatus.SAVED;

@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company;
    private String contactInfo;
    private String roleTitle;
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status = SAVED;
    private String source;
    private boolean remoteFlag;
    private String location;
    private String link;
    private LocalDate deadline;
    private LocalDate appliedDate;
    @Column(insertable=false, updatable=false)
    private Instant createdAt;

    public Long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isRemoteFlag() {
        return remoteFlag;
    }

    public void setRemoteFlag(boolean remoteFlag) {
        this.remoteFlag = remoteFlag;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
