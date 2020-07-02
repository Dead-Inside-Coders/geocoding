package com.deadinside.business.model;

public class Response
{
   private Info info;
   private Options options;
   private Results[] results;

    public Response(Info info, Options options, Results[] results) {
        this.info = info;
        this.options = options;
        this.results = results;
    }

    public Info getInfo() {
        return info;
    }

    public Options getOptions() {
        return options;
    }

    public Results[] getResults() {
        return results;
    }

}
