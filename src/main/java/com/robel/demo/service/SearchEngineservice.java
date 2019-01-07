package com.robel.demo.service;

import com.robel.demo.model.Document;
import com.robel.demo.model.Type;
import com.robel.demo.Data.DocumentDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngineservice implements SearchEngine{

    private DocumentDAO documentDAO;
    public DocumentDAO getDocumentDAO(){
        return documentDAO;
    }

    public void setDocumentDAO(DocumentDAO documentDAO) {
        this.documentDAO = documentDAO;
    }

    @Override
    public List<Document> findByType(Type documentType) {
        List<Document>  result = new ArrayList<Document>();
        for(Document doc : listAll()){
            if(doc.getType().getName().equals(documentType.getName()))
                result.add(doc);
        }
        return result;
    }

    @Override
    public List<Document> listAll() {
        return Arrays.asList(documentDAO.getAll());
    }
}
