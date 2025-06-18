## 📝 To-Do List Console Application (Java)

### 🔧 Overview:

This is a **console-based To-Do List application** built using Java. It allows users to manage their daily tasks efficiently through a user-friendly menu interface. The application supports adding, deleting, completing, and displaying tasks, with visual status indicators like ✅ (Done) and ❌ (Pending) enabled via UTF-8 encoding (`chcp 65001` on Windows).

---

### 🚀 Features:

1. **Add Task**
   Users can enter a task description, which gets added to an in-memory task list.

2. **Delete Task**
   Users can select a task from the displayed list to remove it.

3. **Mark Task as Completed**
   Users can mark specific tasks as completed. A completed task is displayed with a checkmark ✅.

4. **Display All Tasks**
   Displays all current tasks with status indicators (✅ for completed, ❌ for pending).

5. **Exit**
   Exits the program gracefully.

---

### 🗂️ Class Structure:

* **`To_Do`**: Main class that runs the application loop and handles user choices.
* **`Menu`**: Displays the main menu and captures user input for the desired action.
* **`Task`**: Represents a task with a description and a boolean flag for completion.
* **`TaskDisplay`**: Responsible for neatly displaying the list of tasks and their statuses.
* **`Checking`**: Ensures valid task index input when completing or deleting a task.

---

### ✅ Unicode Support:

To display special characters (like ✅, ❌), UTF-8 support is required. On Windows CMD, run:

```bash
chcp 65001
```

This ensures proper rendering of symbols in the console output.

---

### 📌 Sample Output:

```
1. Learn Java - ❌   PENDING
2. Finish Assignment - ✅  DONE
_______________________________________________________________________________________
```


