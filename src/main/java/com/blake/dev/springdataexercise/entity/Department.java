package com.blake.dev.springdataexercise.entity;

public class Department {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.departmentName
     *
     * @mbggenerated
     */
    private String departmentname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.id
     *
     * @return the value of department.id
     *
     * @mbggenerated
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
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.departmentName
     *
     * @return the value of department.departmentName
     *
     * @mbggenerated
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.departmentName
     *
     * @param departmentname the value for department.departmentName
     *
     * @mbggenerated
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }
}