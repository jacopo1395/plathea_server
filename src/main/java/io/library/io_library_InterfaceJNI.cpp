#include <jni.h>
#include <iostream>
#include <vector>
#include <string>
#include "io_library_InterfaceJNI.h"
using namespace std;


class Position{
public:
    float x;
    float y;
    float z;
    float height;
}

class Person{
public:
    int id;
    string name;
    Position position;
}

class Room{
public:
    int id;
    string name;
    vector<Person> people;
    //vector<int> streams;
}

vector<Room> rooms;

JNIEXPORT jstring JNICALL Java_io_library_InterfaceJNI_getRoomInfo(JNIEnv *env, jobject thisObj) {
    //char buf[10] = "Hello";
    //jstring str = env->NewStringUTF(buf);
    
    return str;
}
