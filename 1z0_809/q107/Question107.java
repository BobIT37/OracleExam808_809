package com.wealth.certificate.dumps_1z0_809.question107;

class ImageScanner implements AutoCloseable {

	public void close() throws Exception {
		System.out.print("Scanner closed.");
	}

	public void scanImage() throws Exception {
		System.out.print("Scan.");
		throw new Exception("Unable to scan.");
	}

}

class ImagePrinter implements AutoCloseable {

	public void close() throws Exception {
		System.out.print("Printer closed.");
	}

	public void printImage() {
		System.out.print("Print.");
	}

}

public class Question107 {

	public static void main(String[] args) {
		try (ImageScanner ir = new ImageScanner(); ImagePrinter iw = new ImagePrinter()) {
			ir.scanImage();
			iw.printImage();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
