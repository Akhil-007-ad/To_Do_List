import java.util.*;
//Run chcp 65001 to get tick marks emoji and crossmark emojis
class To_Do{

public static void main(String[] args)
{
	Menu m=new Menu();
	int choice;Scanner sc=new Scanner(System.in);
	TaskDisplay display=new TaskDisplay();
	Checking check=new Checking();
	ArrayList<Task> tasks=new ArrayList<>();int comp_task;
	while(true){
		choice=m.menu();
		switch(choice)
		{
			case 1:
				System.out.print("Enter Your Task:");String description=sc.nextLine();
				tasks.add(new Task(description));
				System.out.println("<--------------------------Task Added Successfully----------------------------->");
				break;
			case 2:
				if(tasks.isEmpty()){
					System.out.println("You have no tasks to delete ......");
				}
				else
				{
					display.showTasks(tasks);
					comp_task=check.checking(tasks.size());
					tasks.remove(comp_task-1);
					System.out.println("<---------------------------- Task Marked Deleted ------------------------->>");
				}
				break;
			case 3:
				if(tasks.isEmpty()){
						System.out.println("You have no tasks to display ......");
				}
				else
				{
					display.showTasks(tasks);
					comp_task=check.checking(tasks.size());
					tasks.get(comp_task-1).isCompleted=true;
					System.out.println("<---------------------------- Task Marked Completed ------------------------->>");
				}
				break;
			case 4:
				if(tasks.isEmpty()){
						System.out.println("You have no tasks to display ......");
				}
				else{
					display.showTasks(tasks);
				}
				break;
			case 5:
				System.out.println("<------------------------- Exiting..........Done --------------------------->");
				System.exit(0);
				break;
			default:
				System.out.println("<-------------------------Choose correct option--------------------------->");
				break;
		}
	}
}

}

class Menu
{
	Scanner sc=new Scanner(System.in);
	int menu()
	{
		
		int choice;
		System.out.print("1.Add Task\n2.Delete Task\n3.Mark as Complete\n4.Display All Tasks\n5.Exit\nEnter Your Choice[1-5]:");
		choice=sc.nextInt();
		return choice;
	}
}
class Task{
	String description;
	boolean isCompleted;
	Task(String description)
	{
		this.description=description;
		isCompleted=false;
	}
}
class TaskDisplay{
	public void showTasks(ArrayList<Task> tasks)
	{
		System.out.println("\nYour Tasks:");int i=1;
		for(Task task:tasks)
		{
			 System.out.println(i+"." + task.description+" - " + (task.isCompleted ? "\u2714"+"  DONE" : "❌"+"   PENDING" ));
			 i++;
		}
		System.out.println("_______________________________________________________________________________________");
	}
}
class Checking{
	Scanner sc=new Scanner(System.in);
	public int checking(int task_length){
		int comp_task;
		while(true)
		{
			System.out.print("Which Task You Want to Complete Enter the index:");comp_task=sc.nextInt();
			if(comp_task>task_length)
			{
				System.out.println("Enter the correct option only.....................................");
			}
			else{
				break;
			}
		}
		return comp_task;
	}
}