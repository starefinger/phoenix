
package com.chinapnr.data.biz;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import com.chinapnr.data.core.Message;

public class MessagesItemWriter implements ItemWriter<Message>{

	public void write(List<? extends Message> messages) throws Exception {
		System.out.println("michael, write results...");
		for (Message m : messages) {
			System.out.println(m.getContent());
		}
	}
}
