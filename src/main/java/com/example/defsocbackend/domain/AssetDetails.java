package com.example.defsocbackend.domain;

import java.util.List;

public class AssetDetails {
    private Integer count;
    private List<String> assets;

    public AssetDetails() {
    }

    public AssetDetails(Integer count, List<String> assets) {
        this.count = count;
        this.assets = assets;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<String> getAssets() {
        return assets;
    }

    public void setAssets(List<String> assets) {
        this.assets = assets;
    }
}
