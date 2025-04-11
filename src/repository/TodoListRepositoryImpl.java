package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {

	public TodoList[] data = new TodoList[10];

	@Override
	public TodoList[] getAll() {
		return data;
	}

	public boolean isFull() {
		var isFull = true;
		for (var i = 0; i < data.length; i++) {
			if (data[i] == null) {
				// model masih ada yang kosong
				isFull = false;
				break;
			}
		}
		return isFull;
	}

	public void resizeIfFull() {
		if (isFull()) {
			var temp = data;
			data = new TodoList[data.length * 2];

			for (var i = 0; i < temp.length; i++) {
				data[i] = temp[i];
			}
		}
	}

	@Override
	public void add(TodoList todolist) {
		resizeIfFull();

		// tambahkan ke posisi ynag data nya null
		for (var i = 0; i < data.length; i++) {
			if (data[i] == null) {
				data[i] = todolist;

				break;
			}
		}
	}

	@Override
	public void remove(Integer number) {

	}
}
