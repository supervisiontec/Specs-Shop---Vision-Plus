package visionplusx.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author Mohan
 */
//XXX:NIDUARA
@VPTable("m_user")
public class MUser {
    @VPId
    private Integer indexNo;
    private String name;
    private String userName;
    private String password;
    private String type;

    public MUser() {
    }

    public MUser(Integer indexNo, String name, String userName, String password, String type) {
        this.indexNo = indexNo;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return indexNo+"-"+name;
    }

}
