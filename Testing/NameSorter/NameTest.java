package NameSorter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {
    @org.junit.jupiter.api.Test
    void name() {

        //Names already alphabetical
        Name name1 = new Name("Ines, Nazarian");
        Name name2 = new Name("Lien, Michel");
        Name name3 = new Name("Pavle, McNaughton");
        Name name4 = new Name("Shion, Towner");

        //Assert comparisons
        assert(name1.compareTo(name2) < 0);
        assert(name2.compareTo(name3) < 0);
        assert(name3.compareTo(name4) < 0);

        assert(name1.compare(name1, name2) < 0);
        assert(name2.compare(name1, name3) < 0);
        assert(name3.compare(name1, name4) < 0);
    }

    @org.junit.jupiter.api.Test
    void sortTest() {
        ArrayList<Name> names = new ArrayList<>();

        //Jumbled order
        names.add(new Name("Pavle, McNaughton"));
        names.add(new Name("Shion, Towner"));
        names.add(new Name("Lien, Michel"));
        names.add(new Name("Ines, Nazarian"));

        Collections.sort(names);

        assert(names.get(0).getNameString().equals("Ines, Nazarian"));
        assert(names.get(1).getNameString().equals("Lien, Michel"));
        assert(names.get(2).getNameString().equals("Pavle, McNaughton"));
        assert(names.get(3).getNameString().equals("Shion, Towner"));
    }
}