package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray){
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        ArrayList<Integer> arrayL = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> location = new ArrayList<>();
        for (int i = 0; i < arrayL.size(); i++) {
            Integer toLookFor = arrayL.get(i);
            for (int j = 0; j < arrayL.size(); j++) {
                if (arrayL.get(j) == toLookFor) {
                    location.add(j);
                }
            }
            if (location.size() >= maxNumberOfDuplications) {
                ArrayList<Integer> arrayLCopy = new ArrayList<>(arrayL);
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
        Integer[] output = new Integer[arrayL.size()];
        for (int l = 0; l < arrayL.size(); l++) {
            output[l] = arrayL.get(l);
        }
        return output;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        ArrayList<Integer> arrayL = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> location = new ArrayList<>();
        for (int i = 0; i < arrayL.size(); i++) {
            Integer toLookFor = arrayL.get(i);
            for (int j = 0; j < arrayL.size(); j++) {
                if (arrayL.get(j) == toLookFor) {
                    location.add(j);
                }
            }
            if (location.size() == exactNumberOfDuplications) {
                ArrayList<Integer> arrayLCopy = new ArrayList<>(arrayL);
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
        Integer[] output = new Integer[arrayL.size()];
        for (int l = 0; l < arrayL.size(); l++) {
            output[l] = arrayL.get(l);
        }
        return output;
    }
}
