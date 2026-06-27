package com.airtribe.meditrack.util;

import java.util.ArrayList;
import java.util.List;

public class DataStore<T>{
    private List<T> records = new ArrayList<>();

    public void add(T obj) {
        records.add(obj);
    }
    public List<T> getAll () {
        return records;
    }
    public Boolean remove(T obj ){
        return records.remove(obj);
    }
}
