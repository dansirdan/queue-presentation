package com.revature.present;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.QueueExampleClass.QueueExample;

@SpringBootApplication
public class QueuePresentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueuePresentationApplication.class, args);

		// Instantiating our custom Queue with Generic
		QueueExample<String> queueExample = new QueueExample<String>();

		// Add to...add an element to the Queue
		queueExample.add("First person");
		queueExample.add("Second person");
		queueExample.add("Third person");
		queueExample.add("Fourth person");
		queueExample.add("Fifth person");

		// Poll and remove the first person in line
		String first = queueExample.poll();
		System.out.println(first);

		// Peek and see the next person, but do not remove
		String peekNext = queueExample.peek();
		System.out.println("Alright, we'll take the " + peekNext);

		// Poll and remove the second person in line
		String second = queueExample.poll();
		System.out.println(second);
		
		// 
		System.out.println("Alright who are the remaining people?");
		queueExample.stream().forEach(person -> System.out.println(person));
		
	}

}
