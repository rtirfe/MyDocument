package com.robel.demo.service;

import com.robel.demo.model.Document;
import com.robel.demo.model.Type;

import java.util.List;

public interface SearchEngine {
    public List<Document> findByType(Type documentType);
    public List<Document> listAll();
}
