/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jack1
 */
package io.library;

import java.util.ArrayList;
import java.util.List;


public class InterfaceJNI {
    // import C++ code
    static {
        System.loadLibrary("core");
    }

    // Singleton
    private static InterfaceJNI instance = null;

    protected InterfaceJNI() {
    }

    public static InterfaceJNI getInstance(){
        if(instance == null) {
         instance = new InterfaceJNI();
      }
      return instance;
    }
    
    
    // Interface
    public native String getPeopleInRoom(int roomID);
    
    class PersonJNI{
        String firstname;
        String surtname;
        
        public PersonJNI(){
            
        }
    }
    
    class RoomJNI{
        List<PersonJNI> people = new ArrayList<PersonJNI>();
        int id;
        List<Integer> streams = new ArrayList<Integer>();
        
    }

}

/*
***********COME COMPILARE JNI***********

javac -h . InterfaceJNI.java
x86_64-w64-mingw32-gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o core.dll InterfaceJNI.c

*/