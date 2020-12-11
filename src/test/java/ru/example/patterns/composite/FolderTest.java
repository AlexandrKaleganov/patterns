package ru.example.patterns.composite;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("тестирование композиции")
@Log4j2
class FolderTest {

    @Test
    public void testComposite() {
        Folder root = new Folder("root");
        Folder mike = new Folder("mike");
        Folder molli = new Folder("molli");
        Folder mikeDoc = new Folder("mikeDoc");
        Folder molliDoc = new Folder("molliDoc");
        root.addFolder(mike, molli);
        mike.addFolder(mikeDoc);
        molli.addFolder(molliDoc);
        log.info(root.toString());
    }
}
