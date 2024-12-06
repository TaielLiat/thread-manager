package com.sheqet.thread_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Implements endpoints for thread management with a simple web preview.
 *
 * @author Taiel Cleiman
 * @version  1.0
 */

@SpringBootApplication
public class ThreadManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ThreadManagerApplication.class, args);

		new Thread(() -> { // Hilo de prueba
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Hilo-Prueba").start();
	}

}
