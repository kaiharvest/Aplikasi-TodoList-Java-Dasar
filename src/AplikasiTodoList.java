public class AplikasiTodoList {

	public static String[] model = new String[10];
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		viewShowTodoList();

	}

	// menampilkan todolist
	public static void showTodoList() {
		System.out.println("TODOLIST");
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
	public static boolean removeTodoList(Integer number) {
		if ((number - 1) >= model.length) {
			return false;
		} else if (model[number - 1] == null) {
			return false;
		} else {
			model[number - 1] = null;

			for (var i = (number - 1); i < model.length; i++) {
				if (i == model.length - 1) {
					model[i] = null;
				} else {
					model[i] = model[i + 1];
				}
			}
			return true;
		}
	}

	public static void testRemoveTodoList() {
		addTodoList("satu");
		addTodoList("dua");
		addTodoList("tiga");
		addTodoList("empat");
		addTodoList("lima");

		var resut = removeTodoList(20);
		System.out.println(resut);

		resut = removeTodoList(7);
		System.out.println(resut);

		resut = removeTodoList(2);
		System.out.println(resut);

		resut = removeTodoList(5);
		System.out.println(resut);

		showTodoList();
	}

	public static String input(String info) {
		System.out.print(info + " : ");

		String data = scanner.nextLine();
		return data;
	}

	public static void testInput() {
		var name = input("name");
		System.out.println("Hi " + name);
	}


	// menampilkan view todolist
	public static void viewShowTodoList() {
		while (true) {
			showTodoList();

			System.out.println("Menu: ");
			System.out.println("1. Tambah");
			System.out.println("2. Hapus");
			System.out.println("x. Keluar");

			var input = input("Pilih");
			if (input.equals("1")) {
				viewAddTodoList();
			} else if (input.equals("2")) {
				viewRemoveTodoList();
			} else if (input.equals("x")) {
				break;
			} else {
				System.out.println("Pilihan tidak dimengerti");
			}
		}


	}

	public static void testViewShowTodoList() {
		addTodoList("satu");
		addTodoList("dua");
		addTodoList("tiga");
		addTodoList("empat");
		addTodoList("lima");
		viewShowTodoList();
	}

	// menampilkan view add todolist
	public static void viewAddTodoList() {
		System.out.println("KEMBALI KE TODOLIST");

		var todo = input("Todo (x jika batal)");
		if (todo.equals("x")) {
			// batal
		} else {
			addTodoList(todo);
		}
	}

	public static void testViewAddTodoList() {
		addTodoList("satu");
		addTodoList("dua");
		addTodoList("tiga");

		viewAddTodoList();

		showTodoList();
	}

	// menampilkan view remove todolist
	public static void viewRemoveTodoList() {
		System.out.println("Menghapus TODOLIST ");

		var number = input("Nomor yang dihapus: (x jika batal)");
		if (number.equals("x")) {
			//batal
		} else {
			boolean success = removeTodoList(Integer.valueOf(number));

			if (!success) {
				System.out.println("gagal meghapus todolist: " + number);
			}
		}
	}


	public static void testViewRemoveTodoList() {
		addTodoList("satu");
		addTodoList("dua");
		addTodoList("tiga");

		showTodoList();

		viewRemoveTodoList();

		showTodoList();
	}

}