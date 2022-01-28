package com.manning.gia.todo.model

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
public class ToDoItem implements Comparable<ToDoItem> {
    Long id;
    String name;
    boolean completed;

    @Override
    public int compareTo(ToDoItem toDoItem) {
        return this.getId().compareTo(toDoItem.getId());
    }
}