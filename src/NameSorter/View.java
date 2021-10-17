package NameSorter;

import java.util.List;

public interface View {
    void readError();
    void writeError();
    void presentNames(List<String> names);
    void success(String saveFileName);
}
