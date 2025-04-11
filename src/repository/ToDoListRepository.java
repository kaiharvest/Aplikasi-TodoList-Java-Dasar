package repository;

import entity.ToDoList;

public interface ToDoListRepository {

	ToDoList[] getAll();

	void add(ToDoList toDoList);

	void remove(Integer number);

}
