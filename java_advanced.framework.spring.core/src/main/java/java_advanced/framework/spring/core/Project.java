package java_advanced.framework.spring.core;

import java.io.Serializable;

public class Project implements Serializable {

    private Integer pid;
    private String name;
    private String status;

    public Project(Integer pid, String name, String status) {
        this.pid = pid;
        this.name = name;
        this.status = status;
    }

    public Integer getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Project [pid=" + pid + ", name=" + name + ", status=" + status + "]";
    }
}