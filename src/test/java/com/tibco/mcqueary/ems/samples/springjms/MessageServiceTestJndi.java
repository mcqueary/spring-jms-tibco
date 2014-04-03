package com.tibco.mcqueary.ems.samples.springjms;

import javax.jms.JMSException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import junit.framework.TestCase;


/**
 * Unit tests for <code>MessageService</code>.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/META-INF/spring/MessageServiceTestJndi-context.xml")
public class MessageServiceTestJndi extends TestCase
{
	@Autowired
	private MessageService messageService;
	private String message;
	
	/**
	 * Test setup.
	 */
	@Before
	public void setUp() {
		message = "TIBCO EMS test message.";
	}
	
	/**
	 * Test that sends a message to a queue.
	 */
	@Test
	public void testSendMessage() {
		messageService.sendMessage(message);
	}
	
	/**
	 * Test that receives a message from a queue.
	 * 
	 * @throws JMSException
	 */
	@Test
	public void testReadMessage() throws JMSException {
		String readMessage = messageService.readMessage();
		assertEquals(readMessage, message);
	}
}