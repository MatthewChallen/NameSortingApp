package NameSorter;

import java.util.Comparator;

//Done for control over the comparator for custom sorting, if needed. Leaves open the option for lastname sorting.
public class Name implements Comparable<Name>, Comparator<Name> {
    private String name;

    public Name(String name){
        this.name = name;
    }

    public String getNameString(){
        return this.name;
    }

    @Override
    public int compareTo(Name o) {
        return this.name.compareTo(o.getNameString());
    }

    @Override
    public int compare(Name o1, Name o2) {
        return o1.getNameString().compareTo(o2.getNameString());
    }
}
