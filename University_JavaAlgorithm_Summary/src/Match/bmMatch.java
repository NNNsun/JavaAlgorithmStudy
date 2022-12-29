package Match;

public class bmMatch {
	static int bmMatch(String txt, String pat) {
		int pt;						//txtĿ��
		int pp;						//patĿ��
		int txtLen = txt.length();	//txt�� ���� ����
		int patLen = pat.length();	//pat�� ���� ����
		int[] skip = new int[Character.MAX_VALUE + 1];	//�ǳʶٱ� ǥ

		//�ǳʶٱ� ǥ �����
		for (pt = 0; pt <= Character.MAX_VALUE; pt++)
			skip[pt] = patLen;
		for (pt = 0; pt < patLen - 1; pt++) 
			skip[pat.charAt(pt)] = patLen - pt - 1;		//pt==patLen-1
		
		
		//�˻�
		while (pt < txtLen) {
			pp = patLen - 1;		//pat�� �� ���ڿ� �ָ�

			while (txt.charAt(pt) == pat.charAt(pp)) { //�����ڿ��� pt�� pp�� �پ��鼭 ������ Ȯ���Ѵ�. 
				if (pp == 0)
					return pt;		//�˻� ����
				pp--;
				pt--;
			}
			pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
		}
		return -1;					//�˻� ����
	}
}