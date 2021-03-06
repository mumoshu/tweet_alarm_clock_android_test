package jp.mumoshu.android.app.tweetalarmclock.test;

import java.io.IOException;
import java.io.InputStream;

import jp.mumoshu.android.webapi.youtube.Video;
import jp.mumoshu.android.webapi.youtube.VideoInfo;
import jp.mumoshu.android.webapi.youtube.VideoInfoSearch;
import jp.mumoshu.http.Http;
import jp.mumoshu.http.HttpStub;
import jp.mumoshu.android.app.tweetalarmclock.R;
import android.test.AndroidTestCase;

public class VideoInfoSearchTest extends AndroidTestCase {
	final String mediaPlayerUrl = "http://www.youtube.com/watch?v=ca3bWy03HAw&feature=youtube_gdata";
	final String videoId = "ca3bWy03HAw";
	final String token = "vjVQa1PpcFN6Is_s4uhEsp3cky3jf4It4tm9xqpcJHw=";
	final String getVideoInfoResponse = "allow_embed=1&vq=None&fmt_url_map=35%7Chttp%3A%2F%2Fv3.lscache7.c.youtube.com%2Fvideoplayback%3Fip%3D211.0.0.0%26sparams%3Did%252Cexpire%252Cip%252Cipbits%252Citag%252Calgorithm%252Cburst%252Cfactor%26fexp%3D903206%252C902305%26algorithm%3Dthrottle-factor%26itag%3D35%26ipbits%3D8%26burst%3D40%26sver%3D3%26expire%3D1271167200%26key%3Dyt1%26signature%3DC7CED57342D9E5C0E6E25CDAB5BD6EA66962B4AC.4E873C22814029B52C430D59C163A1939D8B5F15%26factor%3D1.25%26id%3D71addb5b2d371c0c%2C34%7Chttp%3A%2F%2Fv9.lscache5.c.youtube.com%2Fvideoplayback%3Fip%3D211.0.0.0%26sparams%3Did%252Cexpire%252Cip%252Cipbits%252Citag%252Calgorithm%252Cburst%252Cfactor%26fexp%3D903206%252C902305%26algorithm%3Dthrottle-factor%26itag%3D34%26ipbits%3D8%26burst%3D40%26sver%3D3%26expire%3D1271167200%26key%3Dyt1%26signature%3D966608FA7C0A234D224764416BD2A62C2D0C3B56.7B6813399A0B574C32AB7AB5D5B48447FA5C11C7%26factor%3D1.25%26id%3D71addb5b2d371c0c%2C5%7Chttp%3A%2F%2Fv20.lscache1.c.youtube.com%2Fvideoplayback%3Fip%3D211.0.0.0%26sparams%3Did%252Cexpire%252Cip%252Cipbits%252Citag%252Calgorithm%252Cburst%252Cfactor%26fexp%3D903206%252C902305%26algorithm%3Dthrottle-factor%26itag%3D5%26ipbits%3D8%26burst%3D40%26sver%3D3%26expire%3D1271167200%26key%3Dyt1%26signature%3D3D4D25C5EFB118FAF31D5487B9B91B184A146856.18CAE11F4C35C2203A8DEE1D25B313E411AA68DD%26factor%3D1.25%26id%3D71addb5b2d371c0c&allow_ratings=1&keywords=%E3%81%A8%E3%81%82%E3%82%8B%E7%A7%91%E5%AD%A6%E3%81%AE%E8%B6%85%E9%9B%BB%E7%A3%81%E7%A0%B2%2COP%2Conly%2Cmy%2Crailgun%2C%E6%AD%8C%E8%A9%9E%2C%E6%AD%8C%E8%A9%9E%E4%BB%98%E3%81%8D%2CAdobe%2CPremiere%2CElements8&track_embed=0&fmt_list=35%2F640000%2F9%2F0%2F115%2C34%2F0%2F9%2F0%2F115%2C5%2F0%2F7%2F0%2F0&author=GINTAMA111&muted=0&length_seconds=91&plid=AASEGQPYWkDH6yba&ftoken=&status=ok&watermark=http%3A%2F%2Fs.ytimg.com%2Fyt%2Fswf%2Flogo-vfl106645.swf%2Chttp%3A%2F%2Fs.ytimg.com%2Fyt%2Fswf%2Fhdlogo-vfl100714.swf&timestamp=1271142880&fmt_map=35%2F640000%2F9%2F0%2F115%2C34%2F0%2F9%2F0%2F115%2C5%2F0%2F7%2F0%2F0&hl=ja_JP&fmt_stream_map=35%7Chttp%3A%2F%2Fv3.lscache7.c.youtube.com%2Fvideoplayback%3Fip%3D211.0.0.0%26sparams%3Did%252Cexpire%252Cip%252Cipbits%252Citag%252Calgorithm%252Cburst%252Cfactor%26fexp%3D903206%252C902305%26algorithm%3Dthrottle-factor%26itag%3D35%26ipbits%3D8%26burst%3D40%26sver%3D3%26expire%3D1271167200%26key%3Dyt1%26signature%3DC7CED57342D9E5C0E6E25CDAB5BD6EA66962B4AC.4E873C22814029B52C430D59C163A1939D8B5F15%26factor%3D1.25%26id%3D71addb5b2d371c0c%2C34%7Chttp%3A%2F%2Fv9.lscache5.c.youtube.com%2Fvideoplayback%3Fip%3D211.0.0.0%26sparams%3Did%252Cexpire%252Cip%252Cipbits%252Citag%252Calgorithm%252Cburst%252Cfactor%26fexp%3D903206%252C902305%26algorithm%3Dthrottle-factor%26itag%3D34%26ipbits%3D8%26burst%3D40%26sver%3D3%26expire%3D1271167200%26key%3Dyt1%26signature%3D966608FA7C0A234D224764416BD2A62C2D0C3B56.7B6813399A0B574C32AB7AB5D5B48447FA5C11C7%26factor%3D1.25%26id%3D71addb5b2d371c0c%2C5%7Chttp%3A%2F%2Fv20.lscache1.c.youtube.com%2Fvideoplayback%3Fip%3D211.0.0.0%26sparams%3Did%252Cexpire%252Cip%252Cipbits%252Citag%252Calgorithm%252Cburst%252Cfactor%26fexp%3D903206%252C902305%26algorithm%3Dthrottle-factor%26itag%3D5%26ipbits%3D8%26burst%3D40%26sver%3D3%26expire%3D1271167200%26key%3Dyt1%26signature%3D3D4D25C5EFB118FAF31D5487B9B91B184A146856.18CAE11F4C35C2203A8DEE1D25B313E411AA68DD%26factor%3D1.25%26id%3D71addb5b2d371c0c&avg_rating=5.0&video_id=ca3bWy03HAw&token=vjVQa1PpcFN6Is_s4uhEsp3cky3jf4It4tm9xqpcJHw%3D&thumbnail_url=http%3A%2F%2Fi4.ytimg.com%2Fvi%2Fca3bWy03HAw%2Fdefault.jpg&title=only+my+railgun+TV+ver.%E3%80%80%E6%AD%8C%E8%A9%9E%E4%BB%98%E3%81%8D";
	private Video video;
	private VideoInfoSearch search;

	protected void setUp() throws Exception {
		super.setUp();
		video = new Video("testTitle", mediaPlayerUrl);
		search = new VideoInfoSearch(video);
		InputStream in = getContext()
			.getResources()
			.openRawResource(R.raw.get_video_info);
		Http.setHttpClient(null);
		HttpStub stub = new HttpStub("get_video_info", in);
		Http.setHttpClient(stub);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testExecute() throws IOException {
		VideoInfo info = search.execute();
		assertEquals(videoId, info.getVideoId());
		assertEquals(token, info.getToken());
	}

}
