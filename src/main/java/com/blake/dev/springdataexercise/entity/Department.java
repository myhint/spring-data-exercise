package com.blake.dev.springdataexercise.entity;

import java.io.Serializable;

public class Department implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.id
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_name
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    private String departmentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table department
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.id
     *
     * @return the value of department.id
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.id
     *
     * @param id the value for department.id
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_name
     *
     * @return the value of department.department_name
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_name
     *
     * @param departmentName the value for department.department_name
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Sat Oct 06 19:41:51 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}