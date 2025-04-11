package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
	public static void main(String[] args) {

		testAddTodoList();

	}

	public static void testShowTodoList() {
		TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
		todoListRepository.data[0] = new TodoList("Belajar Java Dasar");
		todoListRepository.data[1] = new TodoList("Belajar Java OOP");
		todoListRepository.data[2] = new TodoList("Belajar Java Standart Class");
		TodoListService toDoListService = new TodoListServiceImpl(todoListRepository);

		toDoListService.showTodoList();
	}

	public static void testAddTodoList() {
		TodoListRepository todoListRepository = new TodoListRepositoryImpl();
		TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

		todoListService.addTodoList("Belajar java Dasar");
		todoListService.addTodoList("Belajar java OOP");
		todoListService.addTodoList("Belajar java Standar Classes");

		todoListService.showTodoList();
	}
}
