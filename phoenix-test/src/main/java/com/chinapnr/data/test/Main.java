package com.chinapnr.data.test;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

/**
 * 
 */

/**
 * @author michael.wang
 *
 */
 public class Main {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext c = 
                 new ClassPathXmlApplicationContext("message_job.xml");
        SimpleJobLauncher launcher = new SimpleJobLauncher();
        launcher.setJobRepository((JobRepository) c.getBean("jobRepository"));
        launcher.setTaskExecutor(new SimpleAsyncTaskExecutor());
        try {
        	System.out.println("michael, testing...");
           launcher.run((Job) c.getBean("messageJob"), new JobParameters());
           //  launcher.run((Job) c.getBean("messageJob"), new JobParameters());
           // new Map<"TEST_SCRIPT_TIME", new JobParameter(Calendar.getInstance().getTimeInMillis())> ()
           //("TEST_SCRIPT_TIME", new JobParameter(Calendar.getInstance().getTimeInMillis()))
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
}
