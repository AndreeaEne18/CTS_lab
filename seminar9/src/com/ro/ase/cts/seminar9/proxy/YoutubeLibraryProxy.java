package com.ro.ase.cts.seminar9.proxy;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface{
	private YoutubeLibraryInterface libImplementation;
	
	 public YoutubeLibraryProxy() {
		libImplementation =new YoutubeLibrary();
	}
	@Override
	public String listVideos() {
		
		return null;
	}

	@Override
	public String getVideoInfo(int id) {
		
		return null;
	}
	
}
