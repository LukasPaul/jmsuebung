package de.novatec.vorlesung.jms.uebung;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;

public class Uebung01 {

	public static void main(String[] args) throws Exception {
		Context ctxt = new InitialContext();
		QueueConnectionFactory factory = (QueueConnectionFactory) ctxt.lookup("ConnectionFactory");
		QueueConnection connection = factory.createQueueConnection();
		QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		Queue queue = (Queue) ctxt.lookup("uebung01");
		connection.start();

		// Uebung implementieren

		connection.close();
	}
}
