package com.robel.demo.service;


import java.util.ArrayList;
import java.util.List;
import com.robel.demo.model.Document;
import com.robel.demo.model.Type;



public class MySearchEngine implements SearchEngine {


    @Override
    public List<Document> findByType(Type documentType) {
        List<Document> result = new ArrayList<Document>();
        for(Document document: storage()){
            if(document.getType().getName().equals(documentType.getName()))
                result.add(document);
        }

        return result;
    }

    @Override
    public List<Document> listAll() {
        return storage();
    }

    private List<Document> storage() {
        List<Document> result = new ArrayList<Document>();
        Type type = new Type();
        type.setName("PDF");
        type.setDesc("Portable Document");
        type.setExtension(".pdf");

        Document document = new Document();
        document.setName("Book Template");
        document.setType(type);
        document.setLocaltion("/Documents/Book Template.pdf");

        result.add(document);

        //more Types and Documents

        return result;
    }
}
