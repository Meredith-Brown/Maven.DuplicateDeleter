package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] stringArray){
        super(stringArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        ArrayList<String> arrayL = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> location = new ArrayList<>();
        for (int i = 0; i < arrayL.size(); i++) {
            String toLookFor = arrayL.get(i);
            for (int j = 0; j < arrayL.size(); j++) {
                if (arrayL.get(j).equals(toLookFor)) {
                    location.add(j);
                }
            }
            if (location.size() >= maxNumberOfDuplications) {
                ArrayList<String> arrayLCopy = new ArrayList<>(arrayL);
                arrayL.clear();
                for (int k = 0; k < arrayLCopy.size(); k++) {
                    if (location.contains(k)) {
                    } else {
                        arrayL.add(arrayLCopy.get(k));
                    }
                }
                i--;
                location.clear();
            } else {
                location.clear();
            }
        }
        String[] output = new String[arrayL.size()];
        for (int l = 0; l < arrayL.size(); l++) {
            output[l] = arrayL.get(l);
        }
        return output;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        ArrayList<String> arrayL = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> location = new ArrayList<>();
        for (int i = 0; i < arrayL.size(); i++) {
            String toLookFor = arrayL.get(i);
            for (int j = 0; j < arrayL.size(); j++) {
                if (arrayL.get(j).equals(toLookFor)) {
                    location.add(j);
                }
            }
            if (location.size() == exactNumberOfDuplications) {
                ArrayList<String> arrayLCopy = new ArrayList<>(arrayL);
                arrayL.clear();
                for (int k = 0; k < arrayLCopy.size(); k++) {
                    if (location.contains(k)) {
                    } else {
                        arrayL.add(arrayLCopy.get(k));
                    }
                }
                i--;
                location.clear();
            } else {
                location.clear();
            }
        }
        String[] output = new String[arrayL.size()];
        for (int l = 0; l < arrayL.size(); l++) {
            output[l] = arrayL.get(l);
        }
        return output;
    }
}
