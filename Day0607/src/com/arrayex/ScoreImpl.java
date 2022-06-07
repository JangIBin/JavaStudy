package com.arrayex;

import java.util.*;

public class ScoreImpl implements Score {

	private Scanner sc = new Scanner(System.in);
	private List<ScoreVO> list = new ArrayList<ScoreVO>();
	
	@Override
	public void insert() {
		System.out.println("�ڷ� ���.....");
		
		String hak;
		System.out.print("�й� �Է� : ");
		hak = sc.next();
		
		ScoreVO temp = readScore(hak);
		
		if(temp != null) {
			System.out.println("�̹� ��ϵ� �й��Դϴ�.");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("�̸� �Է� : ");
		vo.setName(sc.next());
		System.out.print("������� : ");
		vo.setBirth(sc.next());

		System.out.print("�������� : ");
		vo.setKor(sc.nextInt());
		System.out.print("�������� : ");
		vo.setEng(sc.nextInt());
		System.out.print("�������� : ");
		vo.setMat(sc.nextInt());
		
		list.add(vo);
		System.out.println("�ڷ� ��� �Ϸ�...........");
	}
	
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		
		for(ScoreVO temp : list) {
			if(temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		
		return vo;
	}

	@Override
	public void update() {

		System.out.println("�ڷ� ����.....");
		String hak;
		System.out.print("������ �й� �Է� : ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		
		System.out.print("�̸� �Է� : ");
		vo.setName(sc.next());
		System.out.print("������� �Է� : ");
		vo.setBirth(sc.next());
		System.out.print("�������� : ");
		vo.setKor(sc.nextInt());
		System.out.print("�������� : ");
		vo.setEng(sc.nextInt());
		System.out.print("�������� : ");
		vo.setMat(sc.nextInt());
		
		System.out.println("���� �Ϸ�..........");
		
		
	}

	@Override
	public void delete() {

		System.out.println("�ڷ� ����.......");
		String hak;
		System.out.println("������ �й� �Է� : ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		
		list.remove(vo);
		
		System.out.println("���� �Ϸ�......");
		
	}

	@Override
	public void listAll() {

		System.out.println("��ü ����Ʈ ���....");
		Iterator<ScoreVO> it = list.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
		System.out.println();
		
	}

	@Override
	public void searchName() {

		System.out.println("�̸� �˻�....");
		String name;
		
		System.out.print("�˻��� �̸� �Է� : ");
		name = sc.next();
		
		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		System.out.println();
		
	}

	@Override
	public void searchHak() {

		System.out.println("�й� �˻�....");
		String hak;
		
		System.out.print("�˻��� �й� �Է� : ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo != null) {
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.print(vo.getTot()/3 + "\n");
		}
		
	}

}