
package ajaxdemo.action;
import ajaxdemo.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/** *//** Populates the user listing data */
public class UserListingAction extends ActionSupport {

    private List<UserListDTO> userList; // this is available in view automatically!
    public String execute() throws Exception {
        
        // create 2 user objects and add to a list
        setUserList((List<UserListDTO>) new ArrayList());
        UserListDTO user = new UserListDTO();
        user.setId("gjose");
        user.setName("Grace Joseph");
        getUserList().add(user);
        
        user = new UserListDTO();
        user.setId("peter");
        user.setName("PeterSmith");
        getUserList().add(user);
        return SUCCESS;
    }

    public List<UserListDTO> getUserList() {
        return userList;
    }

    public void setUserList(List<UserListDTO> userList) {
        this.userList = userList;
    }
}