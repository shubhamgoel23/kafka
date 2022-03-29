package com.example.demo;

import com.example.demo.config.KafkaConsumerConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


@EmbeddedKafka(partitions = 1,topics = { "testTopic" ,"testTopic022"} ,brokerProperties = { "listeners=PLAINTEXT://localhost:9092", "port=9092" })
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	private static final String TEST_TOPIC = "testTopic";

//	@Autowired
//	EmbeddedKafkaBroker embeddedKafkaBroker;
//
//	@Test
//	public void testReceivingKafkaEvents() {
//		Consumer<Integer, String> consumer = configureConsumer();
//		Producer<Integer, String> producer = configureProducer();
//
//		producer.send(new ProducerRecord<>(TEST_TOPIC, 123, "my-test-value"));
//
//		ConsumerRecord<Integer, String> singleRecord = KafkaTestUtils.getSingleRecord(consumer, TEST_TOPIC);
//		assertThat(singleRecord).isNotNull();
//		assertThat(singleRecord.key()).isEqualTo(123);
//		assertThat(singleRecord.value()).isEqualTo("my-test-value");
//
//		consumer.close();
//		producer.close();
//	}
//
//	private Consumer<Integer, String> configureConsumer() {
//		Map<String, Object> consumerProps = KafkaTestUtils.consumerProps("testGroup", "true", embeddedKafkaBroker);
//		consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//		Consumer<Integer, String> consumer = new DefaultKafkaConsumerFactory<Integer, String>(consumerProps)
//				.createConsumer();
//		consumer.subscribe(Collections.singleton(TEST_TOPIC));
//		return consumer;
//	}
//
//	private Producer<Integer, String> configureProducer() {
//		Map<String, Object> producerProps = new HashMap<>(KafkaTestUtils.producerProps(embeddedKafkaBroker));
//		return new DefaultKafkaProducerFactory<Integer, String>(producerProps).createProducer();
//	}
//	https://blog.mimacom.com/testing-apache-kafka-with-spring-boot-junit5/
//	https://stackoverflow.com/questions/48753051/simple-embedded-kafka-test-example-with-spring-boot
//	https://blog.knoldus.com/testing-spring-embedded-kafka-consumer-and-producer/
//	https://medium.com/trendyol-tech/how-to-integration-test-on-spring-kafka-producer-cb9d1caf0795
//	https://www.baeldung.com/spring-boot-kafka-testing
//	https://github.com/Kevded/integration-test-spring-kafka-with-embedded-kafka-consumer-and-producer
//	https://www.google.com/search?channel=fs&client=ubuntu&q=spring+boot+kafka+integration+test+example
}
