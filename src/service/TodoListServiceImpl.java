package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

	private TodoListRepository todoListRepository;

	public TodoListServiceImpl(TodoListRepository toDoListRepository) {
		this.todoListRepository = toDoListRepository;
	}

	@Override
	public void showTodoList() {
		TodoList[] model = todoListRepository.getAll();

		System.out.println("TODOLIST");
		for (var i = 0; i < model.length; i++) {
			var todolist = model[i];
			var no = i + 1;

			if (todolist != null) {
				System.out.println(no + ". " + todolist.getTodo());
			}
		}
	}

	@Override
	public void addTodoList(String todo) {
		TodoList todoList = new TodoList(todo);
		todoListRepository.add(todoList);
	}

	@Override
	public void removeTodoList(Integer number) {

	}
}
