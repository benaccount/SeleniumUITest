package com.CommonAction.Test;
/* idea here is capture a video recording of any falied test, although Ebenezer needs to put in some more code to actually resolve some error messages
This little stuff will capture vidoe recording of any failed test, and you can see the video file in your C drive mostly..!  You can play it using VLC player.*/
public class VideoRecorderTestMethods {

public class VideoRecorderclass {

	public ScreenRecorder screenRecorder;
	
	@Test
	public void test01() throws Exception {
	VideoRecorderclass videoRecord = new VideoRecorderclass();

	videoRecord.startRecording(); //Started recording
	
	driver.get(“https://someurl.com;);
	driver.findElement(
	By.xpath(“//input”))
	.sendKeys(“DOLLAR”);
	Robot r= new Robot();
	r.mouseWheel(4);
	driver.findElement(By.xpath(“//input[contains(@id,’Passwd’)]”)).sendKeys(“PASSWORD”);

	System.out.println(“Password was typed”);
	Thread.sleep(2000);

	videoRecord.stopRecording(); //Stopped recording

	}
	public void startRecording() throws Exception
	{
	GraphicsConfiguration gc = GraphicsEnvironment
	.getLocalGraphicsEnvironment()
	.getDefaultScreenDevice()
	.getDefaultConfiguration();

	this.screenRecorder = new ScreenRecorder(gc,
	new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	DepthKey, 24, FrameRateKey, Rational.valueOf(15),
	QualityKey, 1.0f,
	KeyFrameIntervalKey, 15 * 60),
	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, “black”,
	FrameRateKey, Rational.valueOf(30)),
	null);
	this.screenRecorder.start();
	}

	public void stopRecording() throws Exception
	{
	this.screenRecorder.stop();
	}
	}
  
	
