
package manager_pkg;

import general_pkg.*;
import java.util.ArrayList;

public class Manager {
    
    ArrayList<IAction> userList = new ArrayList<>();
    public void addUserToList(IAction user){
        userList.add(user);
    }
    
 
    public void printList(){
        userList.forEach(u -> {
            u.showInfo();
        });
    }
    
    public void showLoginStatus(){
        userList.forEach(u -> {
            if (u instanceof User){
                ((User)u).login();
            }
        });
    }
}
