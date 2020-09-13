package org.wzp.hrm.domain;

import java.io.Serializable;

public class Job implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private String remark;

    public Job() {
    	super();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}