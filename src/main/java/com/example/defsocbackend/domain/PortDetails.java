package com.example.defsocbackend.domain;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class PortDetails {

    private Map<String, PortDetail> portMap = new HashMap<>();

    public PortDetails() {
        this.portMap = new HashMap<>();
    }

    @JsonAnySetter
    public void setPortDetail(String port, PortDetail detail) {
        this.portMap.put(port, detail);
    }

    public Map<String, PortDetail> getPortMap() {
        return portMap;
    }

    public static class PortDetail {
        private int n;

        public PortDetail() {
        }

        public PortDetail(int n) {
            this.n = n;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }
    }
}
