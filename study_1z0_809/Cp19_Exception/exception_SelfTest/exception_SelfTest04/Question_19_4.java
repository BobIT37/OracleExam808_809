package com.wealth.certificate.study_1z0_809.chapter19.exception_SelfTest.exception_SelfTest04;

import java.io.IOException;

class Connection implements java.io.Closeable {
    public void close() throws IOException {
        throw new IOException("Close Exception");
    }
}

public class Question_19_4 {
    public static void main(String[] args) {
        try (Connection c = new Connection()) {
            throw new RuntimeException("RuntimeException");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}