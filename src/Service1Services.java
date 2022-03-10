package com.assignment2.service1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Service1Services {
    public List<Service1Words> words = new ArrayList<Service1Words>(
            Arrays.asList(
                    new Service1Words("kash")
            )

    );

    public  List<Service1Words> getWords() {
        return words;
    }

    public void addWord(Service1Words word) {

        words.add(word);
    }
}
