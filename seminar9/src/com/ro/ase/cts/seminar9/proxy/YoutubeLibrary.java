package com.ro.ase.cts.seminar9.proxy;

import java.util.ArrayList;

public class YoutubeLibrary implements YoutubeLibraryInterface{
	private VideoDatabase datebase;
	
	public YoutubeLibrary() {
		this.datebase =new VideoDatabase();
	}
	@Override
	public String listVideos() {
		System.out.println("Fetching video from database..");
		ArrayList<YoutubeVideo> videoList =datebase.getVideosCollection();
		StringBuilder videoListBuilder = new StringBuilder();
		
		for(YoutubeVideo video: videoList) {
			videoListBuilder.append(video.getId())
			.append(" - ")
			.append(video.getTitle())
			.append("\n");
		}
		return videoListBuilder.toString();
	}

	@Override
	public String getVideoInfo(int id) {
		System.out.println("Getching video info.."); 
		return datebase.getVideoInfo(id);
	}

}
