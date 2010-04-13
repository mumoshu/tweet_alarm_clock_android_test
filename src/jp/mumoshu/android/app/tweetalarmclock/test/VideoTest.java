package jp.mumoshu.android.app.tweetalarmclock.test;

import jp.mumoshu.android.webapi.youtube.Video;
import android.test.AndroidTestCase;

public class VideoTest extends AndroidTestCase {
	final String title = "To Aru Kagaku no Railgun OST 01 - only my railgun (TV size)";
	final String mediaPlayerUrl = "http://www.youtube.com/watch?v=OORNj4uOSWo&feature=youtube_gdata";
	final String videoId = "OORNj4uOSWo";
	private Video video;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.video = new Video(title, mediaPlayerUrl);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetVideoId(){
		assertEquals(videoId, video.getVideoId());
	}
}
