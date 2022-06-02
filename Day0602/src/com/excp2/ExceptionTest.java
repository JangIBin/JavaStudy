package com.excp2;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("������ �����Ͽ��� ����� Ȯ�� �ٶ��ϴ�.");
		} catch (MemoryException e) {
			System.out.println("�޸𸮰� �����Ͽ��� ����� Ȯ�� �ٶ��ϴ�.");
		} finally {
			deleteTempFiles();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		
		if(!enoughSpace()) { // ���α׷� ��ġ�� ������ ������ ���
			throw new SpaceException("��ġ�� ������ �ſ� �����մϴ�.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�.");
		}
		
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return false;
	}
	
	static void copyFiles() { // ���� ����
		
	}
	
	static void deleteTempFiles() { // �ӽ����� ����
		 
	}

}
