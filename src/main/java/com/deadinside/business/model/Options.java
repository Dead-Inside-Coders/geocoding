package com.deadinside.business.model;

public class Options {
    private int maxResults;
    private boolean thumbMaps;
    private boolean ignoreLatLngInput;

    public Options(int maxResults, boolean thumbMaps, boolean ignoreLatLngInput) {
        this.maxResults = maxResults;
        this.thumbMaps = thumbMaps;
        this.ignoreLatLngInput = ignoreLatLngInput;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public boolean isThumbMaps() {
        return thumbMaps;
    }

    public boolean isIgnoreLatLngInput() {
        return ignoreLatLngInput;
    }
}
