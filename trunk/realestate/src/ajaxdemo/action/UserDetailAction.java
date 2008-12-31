package ajaxdemo.action;

import ajaxdemo.dto.UserDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

/**//* Populates user details for a user id selected */
public class UserDetailAction extends ActionSupport {
    
    private String userid;
    private UserDetailDTO userDetails;
    
    public String execute() throws Exception {
        // populate only when userid is selected
        if(userid!=null && !userid.equals(""))
            populateDetail(userid);
        return SUCCESS;
    }
    
    private void populateDetail(String id) {
        userDetails = new UserDetailDTO();
        userDetails.setId(id);
        userDetails.setName("The Complete Name");
        userDetails.setEmail("admin@struts2.org");
        userDetails.setAddress("rich street, lavish road, Struts Land");
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
    	this.userid = userid;
    }

    public UserDetailDTO getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetailDTO userDetails) {
        this.userDetails = userDetails;
    }

}