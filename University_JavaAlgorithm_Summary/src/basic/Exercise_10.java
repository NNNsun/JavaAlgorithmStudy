package basic;

import java.util.Scanner;

public class Exercise_10 {
	int y;
	int m;
	int d;

	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����
	};

	// ���� year���� �����ΰ�? (���⣺1����⣺0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// ������(�־��� ��¥�� ����)
	Exercise_10(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	// n�� ���� ��¥�� ��ȯ
	Exercise_10 after(int n) {
		Exercise_10 temp = new Exercise_10(this.y, this.m, this.d);
		if (n < 0)
			return (before(-n));

		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}

	// n�� ���� ��¥�� ��ȯ
	Exercise_10 before(int n) {
		Exercise_10 temp = new Exercise_10(this.y, this.m, this.d);
		if (n < 0)
			return (after(-n));

		temp.d -= n;

		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��¥�� �Է��ϼ���.\n");
		System.out.print("�⣺");
		int y = stdIn.nextInt();
		System.out.print("����");
		int m = stdIn.nextInt();
		System.out.print("�ϣ�");
		int d = stdIn.nextInt();
		Exercise_10 date = new Exercise_10(y, m, d);

		System.out.print("�� �� ��/���� ��¥�� ���ұ��?��");
		int n = stdIn.nextInt();

		Exercise_10 d1 = date.after(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d1.y, d1.m, d1.d);

		Exercise_10 d2 = date.before(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d2.y, d2.m, d2.d);
	}

}