package ru.example.patterns.composite;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/**
 * Class Folder композиция
 *
 * @author Kaleganov Alexander
 * @since 11 дек. 20
 */
public class Folder {

    private final List<Folder> folders = new ArrayList<>();
    String name;

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }

    public void addFolder(Folder... folders) {
        this.folders.addAll(Arrays.asList(folders));
    }

    @Override
    public String toString() {
        Queue<Folder> foldersListString = new LinkedList<>(
                Collections.singletonList(this));
        StringBuilder stringBuilder = new StringBuilder();
        while (foldersListString.size() > 0) {
            foldersListString.addAll(foldersListString.peek().folders);
            stringBuilder.append(Objects.requireNonNull(foldersListString.poll()).name);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
