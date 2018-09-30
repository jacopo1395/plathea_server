/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.library;

import io.swagger.model.Person;
import io.swagger.model.Room;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jack1
 */
public class MainSystem {
    static Map<Integer, Room> rooms = new HashMap<Integer, Room>();
    static Map<Integer, Person> people = new HashMap<Integer, Person>();

    static int IDs;
    
    
    public static class ReturnRoomMessage{
        private String message;
        private Room payload;
        private StatusCode code;

        public ReturnRoomMessage(StatusCode code) {            
            this.code = code;
            if (code==StatusCode.OK){
                this.message = "successful operation";
            }
            if (code==StatusCode.NOT_FOUND){
                this.message = "Room ID not found";
            }
            if (code==StatusCode.INVALID){
                this.message = "Invalid ID supplied";
            }
        }

        public String getMessage() {
            return message;
        }

        public StatusCode getCode() {
            return code;
        }

        public ReturnRoomMessage setMessage(String message) {
            this.message = message;
            return this;
        }

        public void setCode(StatusCode code) {
            this.code = code;
        }

        public Room getPayload() {
            return payload;
        }

        public ReturnRoomMessage setPayload(Room payload) {
            this.payload = payload;
            return this;
        }
        
        
        
    }
    public static class ReturnRoomsMessage{
        private String message;
        private Map<Integer, Room> payload;
        private StatusCode code;

        public ReturnRoomsMessage(StatusCode code) {            
            this.code = code;
            if (code==StatusCode.OK){
                this.message = "successful operation";
            }            
        }

        public String getMessage() {
            return message;
        }

        public StatusCode getCode() {
            return code;
        }

        public ReturnRoomsMessage setMessage(String message) {
            this.message = message;
            return this;
        }

        public void setCode(StatusCode code) {
            this.code = code;
        }

        public Map<Integer, Room> getPayload() {
            return payload;
        }

        public ReturnRoomsMessage setPayload(Map<Integer, Room> payload) {
            this.payload = payload;
            return this;
        }

       
        
        
        
    }
    public static class ReturnPeopleMessage{
        private String message;
        private Map<Integer, Person> payload;
        private StatusCode code;

        public ReturnPeopleMessage(StatusCode code) {            
            this.code = code;
            if (code==StatusCode.OK){
                this.message = "successful operation";
            }
        }

        public String getMessage() {
            return message;
        }

        public StatusCode getCode() {
            return code;
        }

        public ReturnPeopleMessage setMessage(String message) {
            this.message = message;
            return this;
        }

        public void setCode(StatusCode code) {
            this.code = code;
        }

        public Map<Integer, Person> getPayload() {
            return payload;
        }

        public ReturnPeopleMessage setPayload(Map<Integer, Person> payload) {
            this.payload = payload;
            return this;
        }
        
        
        
    }
    
    public enum StatusCode{OK, NOT_FOUND, INVALID}

    public static synchronized ReturnRoomMessage getRoomInfo(int roomID){
        if(roomID<0) return new ReturnRoomMessage(StatusCode.INVALID);
        if (rooms.containsKey(roomID)) {   
            return new ReturnRoomMessage(StatusCode.NOT_FOUND);
        }
        else{
            return new ReturnRoomMessage(StatusCode.OK).setPayload(rooms.get(roomID));
        }        
    }

    public static synchronized ReturnRoomMessage addRoom(String roomName){
        Room room = new Room();
        room.name(roomName);
        room.id(IDs++);
        rooms.put(room.getId(),room);
        // TODO: start dll
        return new ReturnRoomMessage(StatusCode.OK);
    }

    public static synchronized ReturnRoomMessage deleteRoom(int roomId){
        if(rooms.containsKey(roomId)){
            rooms.remove(roomId);
                new ReturnRoomMessage(StatusCode.OK);
        }
        return new ReturnRoomMessage(StatusCode.NOT_FOUND);
    }

    public static synchronized ReturnRoomMessage updateRoom(int roomId, String roomName){
        if(rooms.containsKey(roomId)){
            rooms.get(roomId).setName(roomName);
            new ReturnRoomMessage(StatusCode.OK);
        }
        return new ReturnRoomMessage(StatusCode.NOT_FOUND);
    }

    public static ReturnRoomsMessage getRooms() {
        return new ReturnRoomsMessage(StatusCode.OK).setPayload(rooms);
    }
    
    public static ReturnPeopleMessage getPeopleInRoom(int roomID) {
        Map<Integer,Person> ret = new HashMap<Integer, Person>();
        for(Integer key : people.keySet()){
            if(people.get(key).getPosition().getRoomID()==roomID){
                ret.put(key, people.get(key));
            }
        }
        return new ReturnPeopleMessage(StatusCode.OK).setPayload(ret);
        
    }
    
    
}
