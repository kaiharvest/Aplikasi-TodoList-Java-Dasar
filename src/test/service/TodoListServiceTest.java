package test.service;

import entity.TodoList;
import repository.TodoListRepositoryImpl;
import service.ToDoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
	public static void main(String[] args) {

		testShowTodoList();

	}

	public static void testShowTodoList() {
		TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
		todoListRepository.data[0] = new TodoList("Belajar Java Dasar");
		todoListRepository.data[1] = new TodoList("Belajar Java OOP");
		todoListRepository.data[2] = new TodoList("Belajar Java Standart Class");
		ToDoListService toDoListService = new TodoListServiceImpl(todoListRepository);

		toDoListService.showToDoList();
	}
}
