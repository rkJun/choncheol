package com.appspot.choncheol.jdo;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
//import com.google.appengine.api.users.User;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class MemoriesJDO {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;

    @Persistent
    private String wiseContent;
	
    @Persistent
    private String wiseContentOrg;
        
    @Persistent
    private String wiseAuthor;
    
    @Persistent 
    private String wiseAuthorOrg;
    
    @Persistent
    private Date writeDate;

    @Persistent
    private String writeUser;
    
    @Persistent
    private Date updateDate;
    
    @Persistent
    private String updateUser;
    
    @Persistent
    private boolean isDelete;
    
    public MemoriesJDO(String wiseContent, String wiseContentOrg, String wiseAuthor, 
    		String wiseAuthorOrg, Date writeDate, String writeUser, Date updateDate,
    		String updateUser, boolean isDelete) {

    	this.setWiseContent(wiseContent);
    	this.setWiseContentOrg(wiseContentOrg);
    	this.setWiseAuthor(wiseAuthor);
    	this.setWiseAuthorOrg(wiseAuthorOrg);
    	this.setWriteDate(writeDate);
    	this.setWriteUser(writeUser);
    	this.setUpdateDate(updateDate);
    	this.setUpdateUser(updateUser);
    	this.setDelete(isDelete);
    }

	public Long getId() {
		return id;
	}

	public String getWiseContent() {
		return wiseContent;
	}

	public void setWiseContent(String wiseContent) {
		this.wiseContent = wiseContent;
	}

	public String getWiseContentOrg() {
		return wiseContentOrg;
	}

	public void setWiseContentOrg(String wiseContentOrg) {
		this.wiseContentOrg = wiseContentOrg;
	}

	public String getWiseAuthor() {
		return wiseAuthor;
	}

	public void setWiseAuthor(String wiseAuthor) {
		this.wiseAuthor = wiseAuthor;
	}

	public String getWiseAuthorOrg() {
		return wiseAuthorOrg;
	}

	public void setWiseAuthorOrg(String wiseAuthorOrg) {
		this.wiseAuthorOrg = wiseAuthorOrg;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public String getWriteUser() {
		return writeUser;
	}

	public void setWriteUser(String writeUser) {
		this.writeUser = writeUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
    
}
