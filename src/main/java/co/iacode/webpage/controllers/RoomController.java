package co.iacode.webpage.controllers;

import co.iacode.webpage.models.Room;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/rooms")
public class RoomController{
    private static final List<Room> rooms=new ArrayList<>();
    
    static{
        for(int i=0;i<10;i++){
            rooms.add(new Room(i, "Room "+i, "Room "+i, "Q"));
        }
    }
    
    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}