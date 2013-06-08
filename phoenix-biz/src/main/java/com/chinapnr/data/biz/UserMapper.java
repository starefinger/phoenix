/**
 * 
 */
package com.chinapnr.data.biz;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.chinapnr.data.core.User;

/**
 * @author michael.wang
 *
 */
public class UserMapper implements FieldSetMapper<User> {

	public User mapFieldSet(FieldSet fs) throws BindException {
		// TODO Auto-generated method stub
		User user= new User();
		user.setName(fs.readString(0));
		user.setAge(fs.readInt(1));
		return user;
	}

}
