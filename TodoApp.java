public class TodoApp {
    
public static void main(String args[]){
         Scanner in  = new Scanner(System.in);
         ArrayList<String> todos = new ArrayList<>();
         todos.add("This is test data");
         boolean done = false;
         do{
             System.out.println("What would you like to do? add remove list done");
             String choice = in.nextLine();
             switch(choice){
                 case "add":
                    System.out.println("What would you like to add?");
                    String thingToAdd = in.nextLine();
                    todos.add(thingToAdd);
                    break;
                case "remove":
                    System.out.println("Which number todo would you like to remove?");
                    for(int i = 0; i < todos.size(); i++){
                        System.out.println(i + " : " + todos.get(i));
                    }
                    int indexToRemove = in.nextInt();
                    todos.remove(indexToRemove);
                    in.nextLine();
                    break;
                 case "list":
                    for(String todo : todos){
                        System.out.println(todo);
                    }
                    break;
                case "done":
                    done = true;
                    break;
                default:
                    System.out.println("I don't understand that choice");
                    break;
             }

         }while(!done);

     }
}