package iut.tdd;

public class RomanNumerals {
	String [] Roman= new String []{"I","V","X","L","C","D","M"};
	public String convertToRoman(String arabe) {
		int arabenumber= Integer.parseInt(arabe);
		String result="";
		if (arabenumber>0 && arabenumber<3999){
			if (arabenumber<10){
				result+=convertUniteToRoman(arabenumber);
			}else if (arabenumber<100){
				result+=convertDizaineToRoman(arabenumber);
				result+=convertUniteToRoman(arabenumber%10);
			}
		}


		return result;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}
	public String convertUniteToRoman(int arabe) {
		String romain="";
		switch (arabe){
		case 1: arabe=1;
		romain ="I";
		break;
		case 2: arabe=2;
		romain ="II";
		break;
		case 3: arabe=3;
		romain ="III";
		break;
		case 4: arabe=4;
		romain ="IV";
		break;
		case 5: arabe=5;
		romain ="V";
		break;
		case 6: arabe=6;
		romain ="VI";
		break;
		case 7: arabe=7;
		romain ="VII";
		break;
		case 8: arabe=8;
		romain ="VIII";
		break;
		case 9: arabe=9;
		romain ="IX";
		break;
		}
		return romain;
	}
	public String convertDizaineToRoman(int arabe){
		String romain="";
		int arabei=arabe/10;
		switch (arabei){
		case 1: arabe=1;
		romain ="X";
		break;
		case 2: arabe=2;
		romain ="XX";
		break;
		case 3: arabe=3;
		romain ="XXX";
		break;
		case 4: arabe=4;
		romain ="XL";
		break;
		case 5: arabe=5;
		romain ="L";
		break;
		case 6: arabe=6;
		romain ="LX";
		break;
		case 7: arabe=7;
		romain ="LXX";
		break;
		case 8: arabe=8;
		romain ="LXXX";
		break;
		case 9: arabe=9;
		romain ="XC";
		break;
		}
		return romain;
	}


}


