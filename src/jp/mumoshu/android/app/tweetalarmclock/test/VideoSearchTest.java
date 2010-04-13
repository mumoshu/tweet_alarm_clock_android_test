package jp.mumoshu.android.app.tweetalarmclock.test;

import java.io.IOException;
import java.io.InputStream;

import jp.mumoshu.android.webapi.youtube.Video;
import jp.mumoshu.android.webapi.youtube.VideoSearch;
import jp.mumoshu.android.webapi.youtube.VideosData;
import jp.mumoshu.http.Http;
import jp.mumoshu.http.HttpStub;
import jp.mumoshu.android.app.tweetalarmclock.R;
import android.test.AndroidTestCase;
import android.util.Log;

public class VideoSearchTest extends AndroidTestCase {

	final String title = "IDOLM@STER: XENOGLOSSIA (Only My Railgun~TV Size)";
	final String mediaPlayerUrl = "http://www.youtube.com/watch?v=KxEaK3o5Lec&feature=youtube_gdata";
	private VideoSearch search;

	protected void setUp() throws Exception {
		super.setUp();
		InputStream in = getContext()
			.getResources()
			.openRawResource(R.raw.feeds_api_videos);
		Http.setHttpClient(new HttpStub("Data API", in));
		search = new VideoSearch("keywords");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testExecute(){
		VideosData data = null;
		try {
			data = search.execute();
		} catch (IOException e) {
			Log.e("VideoSearchTest", "IOException", e);
			fail();
		}
		Video first = data.get(0);
		assertNotNull("first item is not null.", first);
		assertEquals(title, first.getTitle());
		assertEquals(mediaPlayerUrl, first.getMediaPlayerUrl());
	}
}
