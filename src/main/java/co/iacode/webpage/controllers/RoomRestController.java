package co.iacode.webpage.controllers;
import co.iacode.webpage.service.RoomService;
import co.iacode.webpage.models.Room;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController{
    private final RoomService roomService;
    
    @Autowired
    public RoomRestController(RoomService roomService){
        this.roomService=roomService;
    }
    
    @GetMapping
    public List<Room> findAll(){
        return roomService.findAll();
    }
}