package com.assignment2.service1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class Service1Words {
    private List<String> word = new ArrayList<String>();

    public Service1Words() {}

    public Service1Words(List<String> word) {
        this.word = word;
    }

    public List<String> getWords() {
        return word;
    }

    public void addWord(List<String> word) {
        this.word = word;
    }
}
