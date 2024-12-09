package com.example.defsocbackend.domain;

public class LeakCounts {
    private Integer vip;
    private Integer domain_stealer;
    private Integer potential_stealer;
    private Integer other_stealer;
    private Integer general_leak;

    public LeakCounts() {
    }

    public LeakCounts(Integer vip, Integer domain_stealer, Integer potential_stealer, Integer other_stealer, Integer general_leak) {
        this.vip = vip;
        this.domain_stealer = domain_stealer;
        this.potential_stealer = potential_stealer;
        this.other_stealer = other_stealer;
        this.general_leak = general_leak;
    }


    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getDomain_stealer() {
        return domain_stealer;
    }

    public void setDomain_stealer(Integer domain_stealer) {
        this.domain_stealer = domain_stealer;
    }

    public Integer getPotential_stealer() {
        return potential_stealer;
    }

    public void setPotential_stealer(Integer potential_stealer) {
        this.potential_stealer = potential_stealer;
    }

    public Integer getOther_stealer() {
        return other_stealer;
    }

    public void setOther_stealer(Integer other_stealer) {
        this.other_stealer = other_stealer;
    }

    public Integer getGeneral_leak() {
        return general_leak;
    }

    public void setGeneral_leak(Integer general_leak) {
        this.general_leak = general_leak;
    }
}
