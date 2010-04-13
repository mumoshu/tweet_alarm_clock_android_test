package jp.mumoshu.android.app.tweetalarmclock.test;

import java.net.URLEncoder;

import jp.mumoshu.android.webapi.youtube.VideoInfo;
import android.net.Uri;
import android.test.AndroidTestCase;

public class VideoInfoTest extends AndroidTestCase {
	final String videoId = "ca3bWy03HAw";
	final String token = "vjVQa1PpcFN6Is_s4uhEsp3cky3jf4It4tm9xqpcJHw=";
	private VideoInfo info;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.info = new VideoInfo(videoId, token);
	}
	
	public void testGetUri() {
		assertEquals(videoId, info.getVideoId());
		assertEquals(token, info.getToken());
		assertEquals(
				Uri.parse("http://www.youtube.com/get_video?video_id=" + videoId + "&t=" + URLEncoder.encode(token)),
				info.getUri()
				);
	}
}
