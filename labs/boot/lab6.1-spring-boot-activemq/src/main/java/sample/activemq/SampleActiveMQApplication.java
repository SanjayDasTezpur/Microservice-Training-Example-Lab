/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.activemq;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
public class SampleActiveMQApplication {

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("sample.queue");
	}


	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SampleActiveMQApplication.class, args);
		Thread.sleep(10000);
	}

}
