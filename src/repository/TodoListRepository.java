package repository;

import entity.TodoList;

public interface TodoListRepository {

	TodoList[] getAll();

	void add(TodoList toDoList);

	void remove(Integer number);

}
