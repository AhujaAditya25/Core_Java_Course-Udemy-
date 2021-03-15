package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Albums {
    private String name;
   static ArrayList<Songs> songs = new ArrayList<Songs>();

    public Albums(String name, ArrayList<Songs> songs) {
        this.name = name;
        Albums.songs = songs;
    }

    public static void addsongs(String name, double duration) {
        if (!findsong(name)) {
            songs.add(new Songs(name, duration));
            System.out.println("Song : "+name+" with duration : "+duration+" is added to the list successfully");
        }
        else System.out.println("Song already exists");
    }
    public static boolean findsong(String name){
        return songs.indexOf(name) >= 0;
    }
//    public static String getname(int index){
//        int index = songs.indexOf(index);
//        songs.get(index);
//    }
        public static void printsongs(){
           for (int i = 0; i<songs.size();i++){
               System.out.println("Song: "+songs.get(i).getTitle() +" duration: "+songs.get(i).getDuration());
           }
        }




    }





