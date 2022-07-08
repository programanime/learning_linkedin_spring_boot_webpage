package co.iacode.webpage.service;

import co.iacode.webpage.models.Room;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService{
    public List<Room> findAll(){
        List<Room> rooms=new ArrayList<>();
        for(int i=0;i<10;i++){
            rooms.add(new Room(i, "Room "+i, "Room "+i, "Q"));
        }
        return rooms;
    }
}