package com.ro.ase.cts.seminar9.proxy;

import java.util.ArrayList;

public class VideoDatabase {
	
	private ArrayList<YoutubeVideo> videosCollection;

	public VideoDatabase() {

		videosCollection = new ArrayList<>();
		videosCollection.add(new YoutubeVideo(1, "How to cook omlette by Hordon Ramsay", 6));
		videosCollection.add(new YoutubeVideo(1, "Omlette recipe by Jamila", 10));

		
	}

	public ArrayList<YoutubeVideo> getVideosCollection() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return videosCollection;
	}
	
	public String getVideoInfo(int id) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(YoutubeVideo video: videosCollection) {
			if(id  == video.getId()) {
				StringBuilder videoDescripBuilder =new StringBuilder();
				videoDescripBuilder.append(video.getTitle())
									.append(" takes you ")
									.append(video.getDuration())
									.append(" minutes to watch");
				return videoDescripBuilder.toString();
								
			}
			
		}
		return "Invalid id provided" ;
	}
}
