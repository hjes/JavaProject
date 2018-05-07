package com.hpp.Thread;

public class TestExtendThread {
	public static void main(String[] args) {
		ExtendThread thread=new ExtendThread();
		thread.start();
		System.out.println("这是主线程");
	}
}
