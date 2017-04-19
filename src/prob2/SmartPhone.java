package prob2;

public class SmartPhone extends MusicPhone {

	public void execute(String function) {
		if( "앱".equals( function )  ) {
			playApp();
			return;
		}else if("음악".equals( function )){
			playMusic();
			return;
		}
		
		super.execute(function);
	}
	
	protected void playApp() {
		System.out.println( "앱실행" );
	}
	@Override
	protected void playMusic() {
		System.out.println( "다운로드해서 음악재생" );
	}
}
