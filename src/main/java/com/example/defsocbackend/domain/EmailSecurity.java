package com.example.defsocbackend.domain;

import java.util.List;

public class EmailSecurity {
    private String spoofable;
    private String dmarc_policy;
    private Integer blacklist_detections;
    private Integer blacklist_total_list;
    private List<String> blacklist_detected_list;

    public EmailSecurity() {
    }

    public EmailSecurity(String spoofable, String dmarc_policy, Integer blacklist_detections, Integer blacklist_total_list, List<String> blacklist_detected_list) {
        this.spoofable = spoofable;
        this.dmarc_policy = dmarc_policy;
        this.blacklist_detections = blacklist_detections;
        this.blacklist_total_list = blacklist_total_list;
        this.blacklist_detected_list = blacklist_detected_list;
    }


    public String getSpoofable() {
        return spoofable;
    }

    public void setSpoofable(String spoofable) {
        this.spoofable = spoofable;
    }

    public String getDmarc_policy() {
        return dmarc_policy;
    }

    public void setDmarc_policy(String dmarc_policy) {
        this.dmarc_policy = dmarc_policy;
    }

    public Integer getBlacklist_detections() {
        return blacklist_detections;
    }

    public void setBlacklist_detections(Integer blacklist_detections) {
        this.blacklist_detections = blacklist_detections;
    }

    public Integer getBlacklist_total_list() {
        return blacklist_total_list;
    }

    public void setBlacklist_total_list(Integer blacklist_total_list) {
        this.blacklist_total_list = blacklist_total_list;
    }

    public List<String> getBlacklist_detected_list() {
        return blacklist_detected_list;
    }

    public void setBlacklist_detected_list(List<String> blacklist_detected_list) {
        this.blacklist_detected_list = blacklist_detected_list;
    }
}
