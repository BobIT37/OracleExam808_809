package com.wealth.certificate.study_1z0_809.chapter19.exception03;

import java.io.IOException;

public class TryWithResource implements AutoCloseable{
	// syntax
	// try (AutoCloseableResource r = new AutoCloseableResource()) {
	// Code that may thrown an exception
	// } catch(Exception e) {
	// Handle exception
	// } finally {
	// Always executes
	// }

	public static void main(String[] args) throws Exception {
		try (TryWithResource twr = new TryWithResource()) {
			throw new Exception("test throws exception");
			//throw new RuntimeException("throws RunTime");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("close before");
		
	}

}

