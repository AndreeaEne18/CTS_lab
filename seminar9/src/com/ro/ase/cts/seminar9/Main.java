package com.ro.ase.cts.seminar9;

import com.ro.ase.cts.seminar9.flyweight.Model3DFactory;
import com.ro.ase.cts.seminar9.flyweight.Model3DFlyweight;
import com.ro.ase.cts.seminar9.flyweight.ModelFlyweightInterface;
import com.ro.ase.cts.seminar9.flyweight.ModelType;
import com.ro.ase.cts.seminar9.flyweight.ScreenData;
import com.ro.ase.cts.seminar9.proxy.YoutubeLibrary;
import com.ro.ase.cts.seminar9.proxy.YoutubeLibraryInterface;
import com.ro.ase.cts.seminar9.proxy.YoutubeLibraryProxy;

public class Main {

	public static void main(String[] args) {
		YoutubeLibraryInterface youbeLib =new YoutubeLibrary();
		//without proxy
		System.out.println(youbeLib.listVideos());
		System.out.println(youbeLib.getVideoInfo(1));
		System.out.println(youbeLib.getVideoInfo(1));
		System.out.println("--------------------------------------------");
		//with proxy
		YoutubeLibraryInterface youbeLibProxy =new YoutubeLibraryProxy();
		System.out.println(youbeLibProxy.listVideos());
		System.out.println(youbeLibProxy.listVideos());
		System.out.println(youbeLibProxy.getVideoInfo(1));
		System.out.println(youbeLibProxy.getVideoInfo(1));
		System.out.println("--------------------------------------------");
		ScreenData dataSet1= new ScreenData("green", 99, 30, 100);
		ScreenData dataSet2 = new ScreenData("red", 20, 30, 40);
		
		ModelFlyweightInterface solider1 = Model3DFactory.getModel(ModelType.SOLIDER);
		ModelFlyweightInterface solider2 = Model3DFactory.getModel(ModelType.SOLIDER);
		
		solider1.display(dataSet1);
		solider1.display(dataSet2);
		solider2.display(dataSet2);
	}

}
