public class AplikasiTodoList {

	public static String[] model = new String[10];

	public static void main(String[] args) {

		testAddTodoList();

	}

	// menampilkan todolist
	public static void showTodoList() {
		for (var i = 0; i < model.length; i++) {
			var todo = model[i];
			var no = i + 1;

			if (todo != null) {
				System.out.println(no + ". " + todo);
			}
		}
	}

	public static void testShowtodolist() {
		model[0] = "belajar java dasar";
		model[1] = "studi kasus java dasar: membuat aplikasi todo list";
		showTodoList();
	}

	// menambah todolist
	public static void addTodoList(String todo) {
		// cek apakah model penuh
		var isFull = true;
		for (var i = 0; i < model.length; i++) {
			if (model[i] == null) {
				// model masih ada yang kosong
				isFull = false;
				break;
			}
		}

		// jika penuh resize ukuran array 2x lipat
		if (isFull) {
			var temp = model;
			model = new String[model.length * 2];

			for (var i = 0; i < temp.length; i++) {
				model[i] = temp[i];
			}
		}


		// tambahkan ke posisi ynag data nya null
		for (var i = 0; i < model.length; i++) {
			if (model[i] == null) {
				model[i] = todo;

				break;
			}
		}

	}

	public static void testAddTodoList() {
		for (var i = 0; i < 25; i++) {
			addTodoList("contoh todo ke: " + i);
		}

		showTodoList();
	}

	// menghapus todolist
	public static void removeTodoList() {

	}


	// menampilkan view todolist
	public static void viewShowTodoList() {

	}

	// menampilkan view add todolist
	public static void viewAddTodoList() {

	}

	// menampilkan view remove todolist
	public static void viewRemoveTodoList() {

	}
}