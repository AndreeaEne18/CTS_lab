package com.ro.ase.cts.seminar9.proxy;

import java.util.HashMap;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface{
	private YoutubeLibraryInterface libImplementation;
	private String videoListCached;
	private HashMap< Integer, String> videoDescriptionsCached;
	private boolean hasExpired;
	
	 public YoutubeLibraryProxy() {
		libImplementation =new YoutubeLibrary();
	}
	@Override
	public String listVideos() {
		if(videoDescriptionsCached == null || hasExpired) {
			videoListCached = libImplementation.listVideos();
			hasExpired=false;
			videoDescriptionsCached= new HashMap<>();
		}
		return videoListCached;
	}

	@Override
	public String getVideoInfo(int id) {
		if(videoDescriptionsCached.get(id)== null ||hasExpired)
		{
			videoDescriptionsCached.put(id, libImplementation.getVideoInfo(id));
		}
		return videoDescriptionsCached.get(id);
	}
	
}
