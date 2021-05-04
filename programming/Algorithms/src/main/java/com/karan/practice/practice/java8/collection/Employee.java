package com.karan.practice.practice.java8.collection;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int eid;
    private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return eid == employee.eid &&
                Objects.equals(ename, employee.ename);
    }

    @Override
    public int hashCode() {

        return Objects.hash(eid, ename);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }

    public int compareTo(Employee o) {
        return o.getEname().compareTo(ename);
    }
}
