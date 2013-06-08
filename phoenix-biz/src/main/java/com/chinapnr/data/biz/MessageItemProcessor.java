package com.chinapnr.data.biz;

import org.springframework.batch.item.ItemProcessor;

import com.chinapnr.data.core.Message;
import com.chinapnr.data.core.User;

public class MessageItemProcessor implements ItemProcessor<User, Message> {

	public Message process(User user) throws Exception {
		// TODO Auto-generated method stub
		Message m = new Message();
		m.setContent("Hello, " 
				+user.getName()
				+", age:"+user.getAge()
				+",please pay your bill.\n"
		);
		
		return m;
	}

}
