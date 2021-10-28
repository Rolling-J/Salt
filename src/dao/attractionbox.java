package dao;
import java.util.ArrayList;
import dto.attraction;

public class attractionbox {
	private ArrayList<attraction> listOfattractions = new ArrayList<attraction>();
	private static attractionbox instance = new attractionbox();

	
	public static attractionbox getInstance() {
		return instance;
	}

	public static void setInstance(attractionbox instance) {
		attractionbox.instance = instance;
	}

	public attractionbox() {
		attraction survival = new attraction("�㸮����","�����̹�");
		survival.setInfo("�㸮���� ������ �´��� ���� ���̱��� �ö󰬴� �� ������ �������� �������� ��Ʈ�����Դϴ�.");
		survival.setRide("40��");
		survival.setAge("5��~64��");
		survival.setTall("130cm~190cm");
		survival.setFilename("�㸮����.png");
		
		attraction horror = new attraction("����Ż��","ȣ��");
		horror.setInfo("12�������� �����ϰ� ���� �̰����� ��� Ƣ����� �𸣴� ���� ���� Ż���϶�!!");
		horror.setRide("30��");
		horror.setAge("9��~64��");
		horror.setTall("���� ����");
		horror.setFilename("����Ż��.png");
		
		attraction adventure = new attraction("���̷ν���","��庥��");
		adventure.setInfo("40������ �ѷ����� �Ŵ��� ȸ���ⱸ�� �ð���ó�� ������ ȸ�����ٶ��� ������ ������ ���� ���ο� ������ ���� �� �ֽ��ϴ�.");
		adventure.setRide("40��");
		adventure.setAge("9��~64��");
		adventure.setTall("130cm~190cm");
		adventure.setFilename("���̷ν���.png");
		
		attraction kidzone = new attraction("ȸ���׳�","Ű����");
		kidzone.setInfo("������ ���ڿ� �ɾ� 4.5m ������� �ü� 50km�� ���� �ӵ��� ���ۺ��� ���� ������ �ݹ��̶� �ϴ÷� ƨ���� ������ ����� ���� �� �ֽ��ϴ�. ȣ���� ���ٵ�� �ϴ÷� ���!");
		kidzone.setRide("10��");
		kidzone.setAge("���� ����");
		kidzone.setTall("���� ����");
		kidzone.setFilename("ȸ���׳�.png");
		
		attraction photozone = new attraction("ȸ����","������");
		photozone.setInfo("64���� �Ƹ��ٿ� �鸶�� Ÿ�� ������ �θ�ƽ�� ����!");
		photozone.setRide("50��");
		photozone.setAge("���� ����");
		photozone.setTall("���� ����");
		photozone.setFilename("ȸ����.png");
		
		attraction exp = new attraction("Ȳ���� ������","ü���");
		photozone.setInfo("�� ����� �ùķ����͸� Ÿ�� 3D�� �����̴� ���� ���꿡�� �Ǵ��� ����ġ����! ���� �ٷ� �ϵ� ���Ȱ�~");
		photozone.setRide("30��");
		photozone.setAge("���� ����");
		photozone.setTall("130cm~190cm");
		photozone.setFilename("Ȳ���� ������.png");

		

		listOfattractions.add(survival);
		listOfattractions.add(horror);
		listOfattractions.add(adventure);
		listOfattractions.add(kidzone);
		listOfattractions.add(photozone);
		listOfattractions.add(exp);
	}

	public ArrayList<attraction> getAllattractions() {
		return listOfattractions;
	}
	
	public attraction getattractionByname(String name) {
		attraction attractionByname = null;

		for (int i = 0; i < listOfattractions.size(); i++) {
			attraction attraction = listOfattractions.get(i);
			if (attraction != null && attraction.getName() != null && attraction.getName().equals(name)) {
				attractionByname = attraction;
				break;
			}
		}
		return attractionByname;
	}
	
	public void addattraction(attraction attraction) {
		listOfattractions.add(attraction);
	}
}
