package test19;

public class Execute {
//	void volumeControl(Volume v, int type) {
//		if(type==1) {
//			v.up();
//		}else if(type==2) {
//			v.down();
//		}else {
//			v.mute();
//		}
//	}
	public static void main(String[] args) {
//		MobilePhone mp = new MobilePhon();
//		volumeControl(mp, 1);
//		Radio r = new Radio();
//		volumeControl(mp, 1 );
		
		Volume v = new MobilePhone();
		v.up();
		v.down();
		v.mute();
	}

}
