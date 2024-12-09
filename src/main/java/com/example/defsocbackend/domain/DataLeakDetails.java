package com.example.defsocbackend.domain;

public class DataLeakDetails {
    private LeakCounts total;
    private LeakCounts resolved;
    private LeakCounts unresolved;
    private Integer enumeration;

    public DataLeakDetails() {
    }

    public DataLeakDetails(LeakCounts total, LeakCounts resolved, LeakCounts unresolved, Integer enumeration) {
        this.total = total;
        this.resolved = resolved;
        this.unresolved = unresolved;
        this.enumeration = enumeration;
    }

    public LeakCounts getTotal() {
        return total;
    }

    public void setTotal(LeakCounts total) {
        this.total = total;
    }

    public LeakCounts getResolved() {
        return resolved;
    }

    public void setResolved(LeakCounts resolved) {
        this.resolved = resolved;
    }

    public LeakCounts getUnresolved() {
        return unresolved;
    }

    public void setUnresolved(LeakCounts unresolved) {
        this.unresolved = unresolved;
    }

    public Integer getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Integer enumeration) {
        this.enumeration = enumeration;
    }
}
