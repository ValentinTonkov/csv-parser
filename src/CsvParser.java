package src;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface CsvParser<T> {
    List<T> parse(File file) throws IOException;
}
