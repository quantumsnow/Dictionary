package com.flowsnake.dictionary.logic.data;

/**
 * Created by jakob on 2/28/16.
 */
public class Term {
    private String term;
    private Tag[] tags;

    public String getTerm() {
        return term;
    }

    public Tag[] getTags() {
        return tags;
    }

    @Override
    public String toString() {
        String string = term;
        for (Tag tag : tags) {
            string += "[" + tag + "]";
        }
        return string;
    }

    public enum Tag {
        // TODO: add tags
        // TODO: implement toString()
    }
}
