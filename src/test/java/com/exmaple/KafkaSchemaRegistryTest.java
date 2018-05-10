package com.exmaple;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.confluent.examples.streams.kafka.EmbeddedSingleNodeKafkaCluster;

public class KafkaSchemaRegistryTest {

	EmbeddedSingleNodeKafkaCluster testCluster;
	
	@Before
	public void setUp() throws Exception {
		testCluster = new EmbeddedSingleNodeKafkaCluster();
		testCluster.start();
	}

	@After
	public void tearDown() throws Exception {
		testCluster.stop();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.printf("Schema registry url for unit testing = %s\n", testCluster.schemaRegistryUrl());
	}

}
