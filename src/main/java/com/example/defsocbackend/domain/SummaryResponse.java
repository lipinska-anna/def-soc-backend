package com.example.defsocbackend.domain;

import com.example.defsocbackend.domain.enums.SummaryStatusEnum;

import java.util.List;

public class SummaryResponse {
    private SummaryStatusEnum status;
    private List<SummaryResult> results;

    public SummaryResponse() {
    }

    public SummaryResponse(SummaryStatusEnum status, List<SummaryResult> results) {
        this.status = status;
        this.results = results;
    }

    public SummaryStatusEnum getStatus() {
        return status;
    }

    public void setStatus(SummaryStatusEnum status) {
        this.status = status;
    }

    public List<SummaryResult> getResults() {
        return results;
    }

    public void setResults(List<SummaryResult> results) {
        this.results = results;
    }
}
