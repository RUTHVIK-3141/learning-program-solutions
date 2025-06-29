package com.example.service;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        // delegates to the API
        return api.getData();
    }
}
