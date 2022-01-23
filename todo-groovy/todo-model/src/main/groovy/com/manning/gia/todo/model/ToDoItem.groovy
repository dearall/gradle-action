package com.manning.gia.todo.model

import groovy.transform.Canonical;

@Canonical
public class ToDoItem implements Comparable<ToDoItem> {
    Long id;
    String name;
    boolean completed;

    @Override
    public int compareTo(ToDoItem toDoItem) {
        return this.getId().compareTo(toDoItem.getId());
    }
}